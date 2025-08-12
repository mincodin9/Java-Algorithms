import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class treeSet04_05 {
    public static int Solution(int n, int k, int[] arr){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int lt=0; lt<n-2; lt++){
            for(int mt=lt+1; mt<n-1; mt++){
                for(int rt=mt+1; rt<n; rt++){
                    set.add(arr[lt]+arr[mt]+arr[rt]);
                }
            }
        }

        int cnt=0;
        for(int x : set){
            cnt++;
            if(cnt==k) return x;
        }

        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Solution(n, k, arr));
    }
}
