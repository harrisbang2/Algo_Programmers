package DayX자연수뒤집어배열로만들기;

import static java.lang.Integer.parseInt;

public class Solution {
    public static int[] solution(long n) {

        String s = String.valueOf(n);
        String []temp = s.split("");
        int[] answer = new int[temp.length];
        int index = 0;
        for (int i = temp.length-1; i >= 0; i--) {
            answer[index] = parseInt(temp[i]);
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(12345)[1]);
    }
}
