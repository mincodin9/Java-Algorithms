package greedy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Friend implements Comparable<Friend>{
    public int time;
    public char stage;
    Friend(int time, char stage){
        this.time=time;
        this.stage=stage;
    }

    @Override
    public int compareTo(Friend o) {
        if(this.time==o.time) return this.stage-o.stage;
        else return this.time-o.time;
    }
}

public class greedy09_03 {
    static int answer=0;
    static ArrayList<Friend> list = new ArrayList<>();

    public void Solution(){
        Collections.sort(list);
        int cnt=0;
        for(Friend f : list){
            if(f.stage=='e') cnt--;
            else{
                cnt++;
                answer=Math.max(cnt, answer);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        greedy09_03 T = new greedy09_03();
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int t=sc.nextInt();
            list.add(new Friend(t, 's'));
            t=sc.nextInt();
            list.add(new Friend(t, 'e'));
        }
        T.Solution();
        System.out.println(answer);
    }
}
