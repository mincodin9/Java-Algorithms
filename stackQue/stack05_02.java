import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack05_02 {
    public static String Solution(char[] chars){
        String answer="";
        Stack<Character> st = new Stack<>();

        for(char c : chars){
            if(c=='(') st.add(c);
            else if(c==')') st.pop();
            else if(st.isEmpty()) answer+=c;
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        System.out.println(Solution(chars));
    }
}
