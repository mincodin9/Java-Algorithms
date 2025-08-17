package sortingSearching;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cacheLRU06_04 {
    public static ArrayList<Integer> Solution(int s, int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(answer.contains(arr[i])) answer.remove(Integer.valueOf(arr[i]));
            if(answer.size()<s) answer.add(arr[i]);
            else{
                answer.remove(0);
                answer.add(arr[i]);
            }
        }
        Collections.reverse(answer);
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
