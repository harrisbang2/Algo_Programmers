package Day8외계행성의나이;

import static java.lang.Integer.parseInt;

public class Solution {
    public static String solution(int age) {
        String answer = String.valueOf(age);
        String []temp =  answer.split("");
        answer="";
        for (int i = 0; i < temp.length; i++) {
            answer += (char)(parseInt(temp[i])+97);
            System.out.println("");
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(100));
    }
}
