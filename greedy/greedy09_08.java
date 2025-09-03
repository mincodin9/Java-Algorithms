package greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Spot implements Comparable<Spot>{
    public int vex;
    public int cost;
    Spot(int vex, int cost){
        this.vex=vex;
        this.cost=cost;
    }

    @Override
    public int compareTo(Spot o) {
        return this.cost-o.cost;
    }
}

public class greedy09_08 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<ArrayList<Spot>> graph = new ArrayList<ArrayList<Spot>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Spot>());
        }
        int[] ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            graph.get(a).add(new Spot(b, c));
            graph.get(b).add(new Spot(a, c));
        }
        int answer=0;
        PriorityQueue<Spot> pQ = new PriorityQueue<>();
        pQ.offer(new Spot(1, 0));
        while(!pQ.isEmpty()){
            Spot tmp=pQ.poll();
            int ev=tmp.vex;
            if(ch[ev]==0){
                ch[ev]=1;
                answer+=tmp.cost;
                for(Spot ob: graph.get(ev)){
                    if(ch[ob.vex]==0) pQ.offer(new Spot(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
