package DayXx만큼간격있는n개의숫자;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num=0;
        if(x==0){
            return answer;
        }
        if(n==0||n>=1000){
            return answer;
        }
        for (int i = 1; i <= n; i++) {
            num+=x;
            answer[i-1]=num;
        }
        return answer;
    }
}
