package Day3짝수는실어요;

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int arraynum = (n%2==0)? n:n+1;
        int a = arraynum/2;
        int[] answer = new int[a];

        int num =0;
        for(int i = 0; i <= n;i++){
            if((i%2)!=0){
                answer[num]=i;
                num++;
            }
        }
        return answer;
    }
    //
    public static void main(String[] args) {
        Solution a = new Solution();

        System.out.println(Arrays.toString(a.solution(14)));
    }
}