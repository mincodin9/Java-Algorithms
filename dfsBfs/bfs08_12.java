package dfsBfs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
    public int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class bfs08_12 {
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;
    static Queue<Point> q=new LinkedList<>();

    public static void BFS(){
        while(!q.isEmpty()){
            Point tmp=q.poll();
            for(int i=0; i<4; i++){
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                if(nx>=1 && nx<=n && ny>=1 && ny<=m && board[nx][ny]==0){
                    board[nx][ny]=1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        bfs08_12 T = new bfs08_12();
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        board=new int[n+1][m+1];
        dis=new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                board[i][j]=sc.nextInt();
                if(board[i][j]==1) q.offer(new Point(i, j));
            }
        }
        T.BFS();

        int answer=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(board[i][j]==0){
                    System.out.println(-1);
                    return;
                }
                answer=Math.max(answer, dis[i][j]);
            }
        }
        System.out.println(answer);
    }
}
