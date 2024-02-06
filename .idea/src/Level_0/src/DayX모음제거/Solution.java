package DayX모음제거;

public class Solution {
    public static String solution(String my_string) {
        String answer = "";
        String[] temp = my_string.split("");
        for (int i = 0; i < temp.length; i++) {
            if(!temp[i].matches("[a,e,i,o,u]")){
                answer += temp[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("asdueioasss"));
    }
}
