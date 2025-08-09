import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class slidingWindow03_03 {
    public static int Solution(int n, int k, int[] nums) {
        int answer = 0;

        for(int i=0; i<n-k; i++){
            int temp=0;
            for(int j=0; j<k; j++){
                temp += nums[i+j];
            }
            answer=Math.max(answer, temp);
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Solution(n, k, nums));
    }
}
