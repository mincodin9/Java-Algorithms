package dfsBfs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs08_14 {
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static int answer=0, n;
    static Queue<Point> q = new LinkedList<>();

    public void BFS(int x, int y, int[][] board){
        q.add(new Point(x, y));
        while(!q.isEmpty()){
            Point pos = q.poll();
            for(int i=0; i<8; i++){
                int nx=pos.x+dx[i];
                int ny=pos.y+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                    board[nx][ny]=0;
                    q.add(new Point(nx, ny));
                }
            }
        }
    }
    public static void Solution(int[][] board){
        bfs08_14 T = new bfs08_14();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    T.BFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        bfs08_14 T = new bfs08_14();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution(arr);
        System.out.println(answer);
    }
}
