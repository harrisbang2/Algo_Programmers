package Day9구슬을나누는경우의수;

class Solution {
    public static int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }

    public static int combination(int n, int m){
        if( m == 0 || n == m) {
            return 1;
        }else{
            return combination(n-1, m-1) + combination(n-1, m);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3,3));
    }
}

