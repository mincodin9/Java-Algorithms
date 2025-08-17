package sortingSearching;

import java.io.IOException;
import java.util.Scanner;

public class cacheLRU06_04 {
    public static int[] Solution(int s, int n, int[] arr){
        int[] answer = new int[s];

        for(int x : arr){
            int pos = -1;
            for(int i=0; i<s; i++) if(answer[i]==x) pos=i;
            if(pos==-1){ //answer 배열에 값이 없을 때
                for(int i=s-1; i>0; i--){
                    answer[i]=answer[i-1];
                }
            } else{ //answer 배열에 값이 있을 때
                for(int i=pos; i>0; i--){
                    answer[i]=answer[i-1];
                }
            }
            answer[0]=x;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : Solution(s, n, arr)){
            System.out.print(x + " ");
        }
    }
}
