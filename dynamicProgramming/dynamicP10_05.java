package dynamicProgramming;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class dynamicP10_05 {
    static int n, m;
    static int[] dy;
    static int Solution(int[] arr){
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;
        for(int i=0; i<n; i++){
            for(int j=arr[i]; j<=m; j++){
                dy[j]=Math.min(dy[j], dy[j-arr[i]]+1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        m=sc.nextInt();
        dy=new int[m+1];
        System.out.println(Solution(arr));
    }
}
