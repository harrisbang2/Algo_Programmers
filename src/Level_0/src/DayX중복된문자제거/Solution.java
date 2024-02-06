package DayX중복된문자제거;


public class Solution {
    public static String solution(String my_string) {
        String answer = "";
        String temp = "";
        for (int i = 0; i < my_string.length(); i++) {
            temp += my_string.charAt(i);
            if(!answer.contains(temp)){
                answer += my_string.charAt(i);
            }
            temp = "";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hhelsadlo"));
    }
}
