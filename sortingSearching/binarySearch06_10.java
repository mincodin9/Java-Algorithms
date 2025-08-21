package sortingSearching;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch06_10 {
    public static int Count(int[] arr, int dist){
        int cnt=1, ep=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public static int Solution(int n, int c, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(Count(arr, mid)>=c){
                answer=mid;
                lt=mid+1;
            }else rt=mid-1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Solution(n, c, arr));
    }
}
