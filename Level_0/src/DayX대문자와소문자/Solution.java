package DayX대문자와소문자;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i)<= 'Z'&&my_string.charAt(i)>= 'A'){
                char ans = (char) (my_string.charAt(i)+32);
                answer += ans;
            }
            else{
                char ans = (char) (my_string.charAt(i)-32);
                answer += ans;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        char A = 'A';
        char a = 'a';
        char ans = (char) (a-32);
        System.out.println((ans));
    }
}
