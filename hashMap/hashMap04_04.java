import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hashMap04_04 {
    public static int Solution(char[] arr, char[] arr2){
        int answer=0, sw=arr2.length, cnt=0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        //초기값 세팅
        for(int i=0; i<sw; i++) map2.put(arr2[i], map2.getOrDefault(arr2[i], 0)+1);
        for(int i=0; i<sw-1; i++) map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        int lt=0;
        for(int rt=sw-1; rt<arr.length; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            if(map.equals(map2)) answer++;

            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;

        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        System.out.println(Solution(arr, arr2));
    }
}
