import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class hashMap04_03 {
    public static int[] Solution(int n, int k, int[] arr){
        int[] answer = new int[n-k+1];
        int lt=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        //초기맵 세팅
        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            answer[0]=map.size();
        }

        for(int rt=k; rt<n; rt++){
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer[lt]=map.size();
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int x=0; x<n; x++){
            arr[x] = Integer.parseInt(st.nextToken());
        }

        for(int x : Solution(n, k, arr)){
            System.out.print(x+" ");
        }
    }
}
