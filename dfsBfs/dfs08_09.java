package dfsBfs;

import java.io.IOException;
import java.util.Scanner;

public class dfs08_09 {
    static int[] p, ch;
    static int n, m;

    public static void DFS(int L, int s){
        if(L==m){
            for(int i=1; i<=m; i++) System.out.print(p[i]+" ");
            System.out.println();
        }else{
            for(int i=s; i<=n; i++){
                if(ch[i]==0){
                    p[L+1]=i;
                    ch[i]=1;
                    DFS(L+1, i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        dfs08_09 T = new dfs08_09();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        p=new int[m+1];
        ch=new int[n+1];
        T.DFS(0, 1);
    }
}
