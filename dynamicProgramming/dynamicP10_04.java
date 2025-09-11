package dynamicProgramming;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick>{
    public int a, h, w;
    Brick(int a, int h, int w){
        this.a=a;
        this.h=h;
        this.w=w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.a-this.a;
    }
}

public class dynamicP10_04 {
    static ArrayList<Brick> list = new ArrayList<>();
    static int[] dp;

    static int Solution(){
        Collections.sort(list);
        int answer=0;
        int n= list.size();
        dp=new int[list.size()];

        for(int i=0; i<n; i++){
            dp[i]=list.get(i).h;
            for(int j=0; j<i; j++){
                if(list.get(j).w > list.get(i).w){
                    dp[i]=Math.max(dp[i], dp[j]+list.get(i).h);
                }
            }
            answer=Math.max(answer, dp[i]);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            int a=sc.nextInt();
            int h=sc.nextInt();
            int w=sc.nextInt();
            list.add(new Brick(a, h, w));
        }
        System.out.println(Solution());
    }
}
