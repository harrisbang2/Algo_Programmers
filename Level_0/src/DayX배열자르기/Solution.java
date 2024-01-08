package DayX배열자르기;

public class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int size = num2-num1+1;
        int[] answer = new int [size];
        int temp =0;
        for (int i = num1; i <= num2; i++) {
            answer[temp] = numbers[i];
            temp++;
        }
        return answer;
    }
}
