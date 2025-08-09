import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class consecutiveInt03_05 {
    public static int Solution(int n) {
        int answer = 0;
        int temp=0;

        for(int i=1; i<n; i++){
            temp=0;
            for(int j=0; temp<n; j++){
                temp += i+j;
                if(temp==n) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(Solution(n));
    }
}
