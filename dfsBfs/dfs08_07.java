package dfsBfs;

import java.io.IOException;
import java.util.Scanner;

public class dfs08_07 {
    static int n, r;
    static int[][] dy;

    public static int DFS(int x, int y){
        if(x==y || y==0) return dy[x][y]=1;
        if(dy[x][y]!=0) return dy[x][y];

        dy[x][y]=DFS(x-1, y-1)+DFS(x-1, y);
        return dy[x][y];
    }

    public static void main(String[] args) throws IOException {
        dfs08_07 T = new dfs08_07();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        dy=new int[n+1][r+1];
        System.out.println(T.DFS(n, r));
    }
}
