package dynamicProgramming;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Problem{
    public int score, time;
    Problem(int score, int time){
        this.score=score;
        this.time=time;
    }
}

public class dynamicP10_6 {
    static int n, m;
    static ArrayList<Problem> list = new ArrayList<>();
    static int[] dy;
    static int Solution(){
        Arrays.fill(dy, 0);
        for(Problem o: list){
            for(int i=m; i>=o.time; i--){
                dy[i]=Math.max(dy[i], dy[i-o.time]+o.score);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            int s=sc.nextInt();
            int t=sc.nextInt();
            list.add(new Problem(s, t));
        }
        dy=new int[m+1];
        System.out.println(Solution());
    }
}
