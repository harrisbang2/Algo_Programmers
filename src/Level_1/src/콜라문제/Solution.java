package 콜라문제;

class Solution {
    public static int solution(int a, int b, int n) {
        int answer = 0;
            while (true){
                if(n < a){
                    break;
                }
                answer+= (n/a)*b;
                n = ((n / a) * b)+(n%a);

            }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
    }
}

