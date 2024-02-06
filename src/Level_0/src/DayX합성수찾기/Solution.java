package DayX합성수찾기;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        int child =0;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    child++;
                }
            }
            if(child > 2){
                answer++;
            }
            System.out.println("Child : "+child);
            child=0;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
