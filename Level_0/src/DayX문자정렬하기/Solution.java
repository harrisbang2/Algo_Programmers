package DayX문자정렬하기;

import static java.lang.Integer.parseInt;

import java.util.Arrays;

class Solution {
    public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        String[] arr = my_string.split("");
        int[]answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(solution("12233asd1")[i]);
        }
    }
}
