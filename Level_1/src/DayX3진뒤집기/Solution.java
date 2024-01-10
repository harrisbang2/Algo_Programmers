package DayX3진뒤집기;

import static java.lang.Integer.parseInt;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n,3);
        String new_s = "";
        int a = s.length()-1;
        for (int i = 0; i <s.length(); i++) {
            new_s += s.charAt(a);
            a--;
        }//
        answer= parseInt(new_s,3);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
