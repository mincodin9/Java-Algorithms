package dfsBfs;

import java.io.IOException;
import java.util.Scanner;

public class dfs08_04 {
    static int n, m;
    static int[] pm;

    public static void DFS(int L){
        if(L==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=1; i<n+1; i++){
                pm[L]=i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        dfs08_04 T = new dfs08_04();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
