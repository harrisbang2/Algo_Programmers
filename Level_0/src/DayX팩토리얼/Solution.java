package DayX팩토리얼;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        int cal = 1;
        if(n == 1 || n == 0){
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            cal *= i;
            if(cal==n){
                return i;
            }
            if(cal>n){
                return i-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3628800));
    }
}
