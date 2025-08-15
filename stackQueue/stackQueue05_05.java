import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueue05_05 {
    public static int Solution(char[] chars){
        int answer=0;
        Queue<Character> q = new LinkedList<>();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<chars.length; i++){
            if(chars[i]=='('&&chars[i+1]==')') {
                q.add('-');
                i++;
            }
            else q.add(chars[i]);
        }

        for(char c: q){
            if(c=='(') st.push(c);
            else if(c=='-') answer+=st.size();
            else {
                st.pop();
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        System.out.println(Solution(chars));
    }
}
