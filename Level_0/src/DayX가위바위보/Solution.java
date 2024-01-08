package DayX가위바위보;

public class Solution {
    public static String solution(String rsp) {
        String answer = "";
        String []temp = rsp.split("");
        for (int i = 0; i < temp.length; i++) {
            if(temp[i].equals("0")){
                answer += "5";
            }
            else if(temp[i].equals("5")){
                answer += "2";
            }
            else {
                answer += "0";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("5"));
    }
}
