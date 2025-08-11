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
        for(int i=0; i<sw; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0)+1);
        }

        for(char c : map.keySet()){
            if(map.get(c)!=map2.get(c)) break;
            cnt++;
            if(cnt==map2.size()) answer++;
        }

        int lt=0;
        for(int rt=sw; rt<arr.length; rt++){
            //lt, rt 값 증가
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);

            //아나그램 비교
            cnt=0;
            for(char c : map.keySet()){
                if(map.get(c)!=map2.get(c)) {
                    break;
                }
                cnt++;
                if(cnt==map2.size()) answer++;
            }
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
