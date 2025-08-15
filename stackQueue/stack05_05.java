import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackQueue05_05 {
    public static int Solution(char[] chars){
        int answer=0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<chars.length; i++){
            if(chars[i]=='(') st.push('(');
            else{
                st.pop();
                if(chars[i-1]=='(') answer+=st.size();
                else answer++;
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

