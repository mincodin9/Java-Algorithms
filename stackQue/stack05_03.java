import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack05_03 {
    public static int Solution(int n, int[][] board, int m, int[] moves){
        int answer=0, dollN=0;
        Stack<Integer> st = new Stack<>();

        for(int x : moves){
            //인형번호 뽑아오기
            dollN=0;
            for(int i=0; i<n; i++){
                if(board[i][x-1]!=0){
                    dollN=board[i][x-1];
                    board[i][x-1]=0;
                    break;
                }
            }

            //값 저장 or answer 증가
            int temp=-1;
            if(!st.isEmpty()) {
                temp=st.pop();
                if(temp==dollN) answer+=2;
                else {
                    st.push(temp);
                    st.push(dollN);
                }
            } else{
                st.push(dollN);
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());

        int[] moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Solution(n, board, m, moves));
    }
}
