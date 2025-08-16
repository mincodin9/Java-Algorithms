import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Patient{
    int id;
    int painVol;
    public Patient(int id, int painVol){
        this.id=id;
        this.painVol=painVol;
    }
}

public class queue05_08 {
    public static int Solution(int n, int m, int[] arr){
        int answer=0;
        Queue<Patient> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.offer(new Patient(i, arr[i]));
        }

        while(!q.isEmpty()){
            Patient tmp = q.poll();
            for(Patient p : q){
                if(tmp.painVol < p.painVol) {
                    q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Solution(n, m, arr));
    }
}
