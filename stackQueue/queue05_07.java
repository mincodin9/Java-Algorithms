import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class queue05_07 {
    public static String Solution(String e, String s){
        String answer="YES";
        Queue<Character> q = new LinkedList<>();

        for(char c : e.toCharArray()) q.offer(c);
        for(char c : s.toCharArray()){
            if(q.isEmpty()) return answer;
            else if(c==q.peek()) q.poll();
        }
        if(!q.isEmpty()) answer="NO";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String e = br.readLine();
        String s = br.readLine();
        System.out.println(Solution(e, s));
    }
}
