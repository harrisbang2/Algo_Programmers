package 핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String []split = phone_number.split("");
        for (int i = 0; i < phone_number.length(); i++) {
            if(i >=phone_number.length()-4){
                answer += split[i];
            }
            else answer += "*";
        }
        return answer;
    }
}
