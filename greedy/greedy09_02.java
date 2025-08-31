package greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    public int s, f;
    Meeting(int s, int f){
        this.s=s;
        this.f=f;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.f==o.f) return this.s-o.s;
        else return this.f-o.f;
    }
}

public class greedy09_02 {
    static int answer=0;
    static ArrayList<Meeting> list = new ArrayList<>();

    public void Solution(){
        Collections.sort(list);
        int end=Integer.MIN_VALUE;
        for(Meeting m : list){
            if(m.s>=end) {
                end=m.f;
                answer++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        greedy09_02 T = new greedy09_02();
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int s=sc.nextInt();
            int f=sc.nextInt();
            list.add(new Meeting(s, f));
        }
        T.Solution();
        System.out.println(answer);
    }
}
