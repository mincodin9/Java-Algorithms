package sortingSearching;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class sorting06_06 {
    public static int[] Solution(int n, int[] arr){
        int[] answer=new int[2];
        int[] arr2 = new int[n];
        int tmp=0;
        for(int i=0; i<n; i++) arr2[i]=arr[i];
        Arrays.sort(arr2);
        for(int i=0; i<n; i++){
            if(arr[i]!=arr2[i]) answer[tmp++]=i+1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x: Solution(n, arr)){
            System.out.print(x+" ");
        }
    }
}
