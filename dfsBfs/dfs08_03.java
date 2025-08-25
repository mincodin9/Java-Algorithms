package dfsBfs;

import java.io.IOException;
import java.util.Scanner;

public class dfs08_03 {
    static int n, m, answer=0;
    static int[][] arr;

    public static void DFS(int L, int time, int score){
        if(time>m) return;
        if(L==n){
            answer=Math.max(answer, score);
            return;
        }
        DFS(L+1, time+arr[L][0], score+arr[L][1]);
        DFS(L+1, time, score);
    }

    public static void main(String[] args) throws IOException {
        dfs08_03 T = new dfs08_03();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][2];
        for(int i=0; i<n; i++) {
            arr[i][1]=sc.nextInt();
            arr[i][0]=sc.nextInt();
        }
        T.DFS(0, 0, 0);
        System.out.println(answer);
    }
}
