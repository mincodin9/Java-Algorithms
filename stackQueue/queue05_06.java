import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue05_06 {
    public static int Solution(int n, int k){
        int answer=0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i=1; i<n+1; i++){
            q1.add(i);
        }

        int target=0;
        while(q1.size()!=1){
            for(int i=0; i<q1.size(); i++){
                target++;
                if(target==k){
                    target=0;
                    q1.poll();
                }
                else q2.add(q1.poll());
            }
            for(int j=0; j<q2.size(); j++) q1.add(q2.poll());
        }
        answer=q1.peek();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(Solution(n, k));
    }
}
