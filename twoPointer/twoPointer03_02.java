import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;

public class twoPointer03_02 {
    public static ArrayList<Integer> Solution(int n, int[] ns, int m, int[] ms) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(ns);
        Arrays.sort(ms);

        for(int i=0; i<n+m; i++){
            if(p1==n||p2==m) break;
            else if(ns[p1]==ms[p2]){
                answer.add(ns[p1]);
                p1++;
                p2++;
            } else if(ns[p1]>ms[p2]) p2++;
            else if(ns[p1]<ms[p2]) p1++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];
        for(int i=0; i<n; i++){
            ns[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] ms = new int[m];
        for(int i=0; i<m; i++){
            ms[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = Solution(n, ns, m, ms);
        for(int x=0; x< answer.size(); x++){
            System.out.print(answer.get(x)+" ");
        }
    }
}
