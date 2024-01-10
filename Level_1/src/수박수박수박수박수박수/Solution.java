package 수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i =1; i <= n ; i++){
            String s = i%2==0 ? "박":"수";
            answer += s;
        }
        return answer;
    }
}
