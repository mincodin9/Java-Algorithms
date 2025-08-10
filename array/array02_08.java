import java.util.Scanner;

public class test2_08 {
    public static int[] test(int n, int[] nums){
        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            int x=1;
            for(int y=0; y<n; y++){
                if(nums[y]>nums[i]){
                    x++;
                }
            }
            answer[i]=x;
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        for(int x: test(n, nums)){
            System.out.print(x + " ");
        }
        return ;
    }
}
