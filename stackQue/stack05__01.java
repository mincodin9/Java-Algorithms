import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack05_01 {
    public static String Solution(char[] chars){
        String answer="YES";
        Stack<Character> st = new Stack<>();

        for(char c : chars){
            if(c == '(') st.push('(');
            else if(c == ')') {
                if(!st.isEmpty()) st.pop();
                else return "NO";
            }
        }
        if(!st.isEmpty()) return "NO";

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        System.out.println(Solution(chars));
    }
}
