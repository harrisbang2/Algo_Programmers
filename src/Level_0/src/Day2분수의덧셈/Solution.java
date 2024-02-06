package Day2분수의덧셈;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        //start
        int max_denominator = denom1*denom2;
        float temp = (numer1 * denom2)+(numer2 *denom1);
        for(int i = max_denominator;i>1;i--){
            if((max_denominator%i)==0){
                if((temp%i)==0){
                    temp = temp/i;
                    max_denominator = max_denominator/i;
                }
            }
        }
        answer = new int[]{(int) temp,max_denominator};
        //ans
        return answer;
    }
}
