import java.util.Scanner;
import java.util.Arrays;

public class twoPointer03_01 {
    public static int[] Solution(int n, int[] ns, int m, int[] ms) {
        int[] answer = new int[n + m];
        int j = 0;
        int k = 0;

        Arrays.sort(ns);
        Arrays.sort(ms);

        for (int i = 0; i < n+m; i++) {
            if(j<n&&k<m){
                if (ns[j] < ms[k]) {
                    answer[i] = ns[j];
                    j++;
                }
                else{
                    answer[i] = ms[k];
                    k++;
                }
            } else if (j<n&&k>=m) {
                answer[i] = ns[j];
                j++;
            } else if (j>=n&&k<m){
                answer[i] = ms[k];
                k++;
            } else break;
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
        int[] answer = Solution(n, ns, m, ms);
        for(int x : answer){
            System.out.print(x+" ");
        }
    }
}
