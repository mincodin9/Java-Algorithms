package sortingSearching;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class searching06_05 {
    public static String Solution(int n, int[] arr){
        String answer="U";
        HashMap<Integer, String> hashMap = new HashMap<>();

        for(int x: arr){
            if(!hashMap.containsKey(x)) hashMap.put(x, "U");
            else return "D";
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
        System.out.print(Solution(n, arr));
    }
}
