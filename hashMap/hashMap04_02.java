import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hashMap04_02 {
    public static String Solution(String s1, String s2){
        String answer="YES";
        int x=0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        for(char c : s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        for(char c : map1.keySet()){
            if(map1.get(c)!=(map2.get(c))) return "NO";
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        System.out.println(Solution(s1, s2));
    }
}
