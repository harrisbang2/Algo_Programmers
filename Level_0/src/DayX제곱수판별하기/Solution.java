package DayX제곱수판별하기;

public class Solution {
    public static int solution(int n) {
        int answer = 2;
        for (int i = 0; i <= n/10; i++) {
            if(i*i == n){
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(101));
    }
}
