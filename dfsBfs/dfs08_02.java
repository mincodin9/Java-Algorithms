package dfsBfs;

import java.io.IOException;
import java.util.Scanner;

public class dfs08_02 {
    static int c, n, answer=0;
    static int[] arr;

    public static void DFS(int L, int sum){
        if(sum>c) return;
        if(L==n){
            answer=Math.max(answer, sum);
            return;
        }
        DFS(L+1, sum+arr[L]);
        DFS(L+1, sum);
    }

    public static void main(String[] args) throws IOException {
        dfs08_02 T = new dfs08_02();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
