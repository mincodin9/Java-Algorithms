package sortingSearching;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class searching06_08 {
    public static int Solution(int n, int m, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;

        while(lt<=rt){
            int md=(lt+rt)/2;
            if(arr[md]==m){
                answer=md+1;
                break;
            }
            if(arr[md]>m) rt=md-1;
            else lt=md+1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Solution(n, m, arr));
    }
}
