package 시저암호;

class Solution {
    public static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(Character.isLowerCase(temp)) { //소문자
                temp = (char) ((temp - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(temp)) { //대문자
                temp = (char) ((temp - 'A' + n) % 26 + 'A');
            }
            answer += temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        char a = ' ';
        System.out.println(a);
        System.out.println(solution("a b c",5));
    }
}
