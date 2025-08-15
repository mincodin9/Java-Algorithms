import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack05_04 {
    public static int Solution(char[] chars){
        int answer=0;
        Stack<Integer> st = new Stack<>();

        for(char c : chars){
            if((int)c>=49 && (int)c<=57) st.push((int)c-48);
            else{
                int b=st.pop(), a=st.pop();
                if(c=='*') st.push(a*b);
                else if(c=='+') st.push(a+b);
                else if(c=='-') st.push(a-b);
                else st.push(a/b);
            }
        }
        answer=st.pop();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        System.out.println(Solution(chars));
    }
}
