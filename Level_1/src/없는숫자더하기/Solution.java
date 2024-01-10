package 없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int []nums = new int[10];
        boolean conatains = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == numbers[j] ){
                    conatains = true;
                }
            }
            if(!conatains){
                answer += i;
            }
            conatains = false;
        }
        return answer;
    }
}
