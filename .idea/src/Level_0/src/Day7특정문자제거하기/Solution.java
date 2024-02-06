package Day7특정문자제거하기;

public class Solution {
    public static String solution(String my_string, String letter) {
        String answer = "";
        char a = letter.charAt(0);
        for(int i=0;i<my_string.length();i++)
            if(my_string.charAt(i) != a)
                answer += my_string.charAt(i);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("apple","a"));
    }
}
