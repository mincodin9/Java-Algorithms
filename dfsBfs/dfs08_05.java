package dfsBfs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class dfs08_05 {
    static int n, m, answer=Integer.MAX_VALUE, sum=0;
    static int[] arr;

    public static void DFS(int L){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m){
            answer=Math.min(answer, L);
        }else{
            for(int i=0; i<n; i++){
                sum+=arr[i];
                DFS(L+1);
                sum-=arr[i];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        dfs08_05 T = new dfs08_05();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);

        m = sc.nextInt();
        for(int i=0; i<n/2; i++){
            int tmp=arr[i]; arr[i]=arr[n-1-i]; arr[n-1-i]=tmp;
        }

        T.DFS(0);
        System.out.println(answer);
    }
}
