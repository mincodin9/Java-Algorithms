package greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Speech implements Comparable<Speech>{
    public int pay, time;
    Speech(int pay, int time){
        this.pay=pay;
        this.time=time;
    }

    @Override
    public int compareTo(Speech o) {
        return o.time-this.time;
    }
}

public class greedy09_04 {
    static int answer=0, n, max;
    static ArrayList<Speech> list = new ArrayList<>();

    public void Solution(){
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);
        int j=0;
        for(int i=max; i>=1; i--){
            for(; j<n; j++){
                if(list.get(j).time<i) break;
                pQ.offer(list.get(j).pay);
            }
            if(!pQ.isEmpty()) answer+= pQ.poll();
        }
    }

    public static void main(String[] args) throws IOException {
        greedy09_04 T = new greedy09_04();
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        for(int i=0; i<n; i++){
            int p=sc.nextInt();
            int t=sc.nextInt();
            list.add(new Speech(p, t));
            max=Math.max(max, t);
        }
        T.Solution();
        System.out.println(answer);
    }
}
