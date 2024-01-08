package Day6문자반복출력하기;

public class Solution {
    public static String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0;i<=my_string.length()-1;i++){
            for (int j=1;j<=n;j++)
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("apple",3));
    }
}
