package 약수의갯수와덧셈;

class Solution {
    public static int solution(int left, int right) {
        int answer = 0;
        int total = 0;
        for (int i = left; i <= right; i++) {
            System.out.println(total);
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    total++;
                }
            }
            System.out.println(total);
            if(total%2 ==0){
                answer += i;
                total = 0;
            }
            else {
                answer -= i;
                total = 0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(13,17));
    }
}
