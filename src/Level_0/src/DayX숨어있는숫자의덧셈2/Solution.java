package DayX숨어있는숫자의덧셈2;

public class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        int timer =1;
        String[] temp = my_string.split("");
        for (int i = temp.length-1; i >=0; i--) {
            // 0 일 경유도 있어
            if(temp[i].matches("[0-9]"))
            {
                answer+= Integer.parseInt(temp[i])*timer;
                if(i!=0&&temp[i-1].matches("[0-9]")){
                    timer*=10;
                }
                else {
                    timer =1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1s223s3sd5"));
    }

}
