package DayX숫자찾기;

public class Solution {
    public static int solution(int num, int k) {
        int answer = -1;
        String k2 = String.valueOf(k);
        String a = "";
        a+=num;
        String []temp =a.split("");
        for (int i = 0; i < a.length(); i++) {
            if(temp[i].equals(k2)){
                answer=i+1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(29183,1));
    }
}
