package DayX최대값만들기;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int n = 0; n < numbers.length; n++) {
            for (int i = 0; i < numbers.length; i++) {
                if(i!=n&&numbers[i]*numbers[n]>answer){
                    answer = numbers[i]*numbers[n];
                }
            }
        }
        return answer;
    }
}
