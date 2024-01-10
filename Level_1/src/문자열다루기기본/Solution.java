package 문자열다루기기본;

public class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String[] split = s.split("");
        if(s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++) {
            if(split[i].matches("[A-za-z]")){
                answer = false;
            }
        }
        return answer;
    }
}
