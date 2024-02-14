package year2016;

public class Solution {
    public String solution(int a, int b) {
        String[] days={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        String answer = "";
        //모든 날을 수해야함
        int count =-1;
        for (int i = 0; i < a-1; i++) {
            count += month[i];
        }
        answer=days[(count+b)%7];
        return answer;
    }
}
