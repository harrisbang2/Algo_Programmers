package Day2숫자비교하기;

class Solution {
    public int solution(int num1, int num2) {
        boolean same = num1 == num2;
        int answer = same?1:-1;
        return answer;
    }
}
