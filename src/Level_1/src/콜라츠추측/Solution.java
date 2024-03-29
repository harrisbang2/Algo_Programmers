package 콜라츠추측;

public class Solution {
    public static int solution(int num) {
        int answer = 0;
        long temp = num;
        if(num == 1){
            return 0;
        }
        for (int i = 0; i <= 500; i++) {
            if(temp%2==0){
                temp = temp/2;
                answer++;
            } else if (temp%2==1) {
                temp *= 3;
                temp += 1;
                answer++;
            }
            if (temp==1){
                return answer;
            }
        }
        return -1;
        }


    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
