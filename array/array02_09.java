import java.util.Arrays;
import java.util.Scanner;

public class test2_09 {
    public static int MaxRow(int[][] rows){
        int row=0;
        int[] list= new int[rows.length];

        for(int i=0; i<rows.length; i++){
            for(int j=0; j<rows.length; j++){
                list[i]+=rows[i][j];
            }
        }
        row= Arrays.stream(list).max().orElse(0);
        return row;
    }

    public static int MaxColumns(int[][] columns){
        int column=0;
        int[] list= new int[columns.length];

        for(int i=0; i<columns.length; i++){
            for(int j=0; j<columns.length; j++){
                list[i]+=columns[j][i];
            }
        }
        column= Arrays.stream(list).max().orElse(0);
        return column;
    }

    public static int MaxCross(int[][] crosses){
        int cross=0;
        int cnt=crosses.length;
        int a=0;
        int b=0;

        for(int i=0; i<cnt; i++){
            a+=crosses[i][i];
        }

        for(int i=0; i<cnt; i++){
            b+=crosses[i][cnt-i-1];
        }

        cross= Math.max(a, b);
        return cross;
    }

    public static int test(int n, int[][] nums){
        int answer = 0;

        int[] list = new int[3];
        list[0] = MaxRow(nums);
        list[1] = MaxColumns(nums);
        list[2] = MaxCross(nums);

        answer = Arrays.stream(list).max().orElse(0);

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.print(test(n, nums));
    }
}
