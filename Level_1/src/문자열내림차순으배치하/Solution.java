package 문자열내림차순으배치하;

public class Solution {
    public static String solution(String s) {
        String answer = "";
        String []split = s.split("");
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                if(split[i].charAt(0) > split[j].charAt(0)){
                    String mem = split[j];
                    split[j] = split[i];
                    split[i] = mem;
                }
            }
        }
        for (int i = 0; i < split.length; i++) {
            answer+= split[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
