package DayX369게임;

public class Solution {
    public static int solution(int order) {
        int answer = 0;
        String temp = String.valueOf(order);
        for (int i = 0; i < temp.length(); i++) {
            if((temp.charAt(i)!='0')&&(temp.charAt(i)%3==0)){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123456));
    }
}
