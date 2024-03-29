package DayX인덱스바꾸기;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String []temp = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            if(i == num1){
                answer+=temp[num2];
            } else if (i==num2) {
                answer+=temp[num1];
            }
            else {
                answer+=temp[i];
            }
        }
        return answer;
    }
}
