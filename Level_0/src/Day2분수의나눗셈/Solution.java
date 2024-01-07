package Day2분수의나눗셈;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float div = ((float) num1 / num2);
        float answer_f = 0;
        if(((num1 <= 100)&&(0 < num1))&&((num2 <= 100)&&(0 < num2)))
            answer_f = 1000*div;
        answer = (int)answer_f;
        return answer;
    }
}
