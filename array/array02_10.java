import java.util.Scanner;

public class test2_10 {
    public static boolean Peaks(int i, int j, int[][] nums){

        int a, b, c, d;

        //왼
        if(j==0) a=0;
        else a=nums[i][j-1];

        //오
        if(j==nums.length-1) b=0;
        else b=nums[i][j+1];

        //위
        if(i==0) c=0;
        else c=nums[i-1][j];

        //아래
        if(i==nums.length-1) d=0;
        else d=nums[i+1][j];


        switch(0){
            case 0:
                if(nums[i][j]<=a) return false; //봉우리 x
            case 1:
                if(nums[i][j]<=b) return false; //봉우리 x
            case 2:
                if(nums[i][j]<=c) return false; //봉우리 x
            case 3:
                if(nums[i][j]<=d) return false; //봉우리 x
        }

        return true;
    }

    public static int test(int n, int[][] nums){
        int answer = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(Peaks(i, j, nums)) answer++;
            }
        }

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
        System.out.println(test(n, nums));
    }
}
