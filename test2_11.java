import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int test(int n, int[][] nums){
        int answer = 0;
        ArrayList<Integer> stu = new ArrayList<>();
        int max = 0;

        for(int i=0; i<n; i++){
            int temp=0;
            for(int j=0; j<n; j++){
                for(int k=0; k<5; k++){
                    if(nums[i][k]==nums[j][k]) {
                        temp+=1;
                        break;
                    }
                }
            }
            max = Math.max(max, temp);
            stu.add(temp);
        }
        answer = (stu.indexOf(max)) + 1;

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(test(n, nums));
    }
}
