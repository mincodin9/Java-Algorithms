import java.util.Scanner;

public class array_12 {
    public static int Solution(int n, int m, int[][] ranks) {
        int answer = 0;

        //1. 우선 첫번째 수학시험에서 두명 A, B를 뽑는다
        //2. 다음 시험에서 두 학생의 위치를 비교해서 A가 순위가 앞서면 계속 비교한다(아니면 break)
        //3. 마지막 수학시험까지 A가 앞서면 answer를 +1한다
        for (int i = 0; i < n; i++) { //학생수
            for (int j = i + 1; j < n; j++) {
                int A = ranks[0][i];
                int B = ranks[0][j];

                for(int k=1; k<m; k++){ //수학시험수
                    int C=0;
                    int D=0;
                    for(int l=0; l<n; l++){ //수 찾기
                        if(ranks[k][l]==A) C=l;
                        if(ranks[k][l]==B) D=l;
                    }
                    if(C>D) break;
                    if(k==(m-1)) answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ranks = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ranks[i][j] = sc.nextInt();
            }
        }
        System.out.println(Solution(n, m, ranks));
    }

}
