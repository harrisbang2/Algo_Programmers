package DayX나머지가1이되는수찾기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==1){
                return i;
            }
        }
        return answer;
    }
}
