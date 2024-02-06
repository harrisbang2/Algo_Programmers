package 두정사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            int mem = a;
            a = b;
            b = mem;
        }
        for (int i = a; i <= b; i++) {
            answer+=i;
        }
        return answer;
    }
}
