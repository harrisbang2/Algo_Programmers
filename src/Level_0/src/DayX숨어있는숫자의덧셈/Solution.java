package DayX숨어있는숫자의덧셈;

import static java.lang.Integer.parseInt;

public class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        String[] temp = my_string.split("");
        for (int i = 0; i < temp.length; i++) {
            if(temp[i].matches("[1-9]")) answer+= Integer.parseInt(temp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123sd5"));
    }

}
