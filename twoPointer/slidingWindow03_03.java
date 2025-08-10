import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class slidingWindow03_03 {
    public static int Solution(int n, int k, int[] nums) {
        int answer = 0
        int sum = 0;
        //최초값 sum저장
        for(int i=0; i<k; i++) sum+=arr[i];
        answer=sum;
        //sum + arr[i] - arr[i-k]로 슬라이딩 윈도우를 밀고감
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum);
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

