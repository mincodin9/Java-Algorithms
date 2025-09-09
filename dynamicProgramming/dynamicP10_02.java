package dynamicProgramming;

import java.io.IOException;
import java.util.Scanner;

public class dynamicP10_02 {
    static int[] dy;
    static int Solution(int n){
        dy[1]=1;
        dy[2]=2;
        for(int i=3; i<=n+1; i++){
            dy[i]=dy[i-1]+dy[i-2];
        }
        return dy[n+1];
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        dy=new int[n+2];
        System.out.println(Solution(n));
    }
}
