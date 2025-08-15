import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue05_06 {
    public static int Solution(int n, int k){
        int answer=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) q.offer(i);
        while(!q.isEmpty()) {
            for(int i=1; i<k; i++)q.offer(q.poll());
            q.poll();
            if(q.size()==1) answer=q.poll();
        }
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

