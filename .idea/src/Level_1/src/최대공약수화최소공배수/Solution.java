package 최대공약수화최소공배수;

import java.util.HashSet;

class Solution {
    public static int[] solution(int n, int m) {
        int[] answer = {0,0};
        if(n>m){
            int mem = n;
            n = m;
            m = mem;
        }
        //getting the LowestCommonMultiple
        HashSet<Integer> CommonMultiple = new HashSet();
        for (int i = 1;true; i++) {
            int new_n = i*n;
            int new_m = i*m;
            if(CommonMultiple.contains(new_n)){
                answer[1] = new_n;
                break;
            }
            CommonMultiple.add(new_n);
            CommonMultiple.add(new_m);
        }
        // getting the highest common factor
        int CommonFactor = 1;
        for (int i = 1; i<=n; i++) {
            if((n%i==0) &&(m%i==0)){
                CommonFactor = i;
            }
        }
        answer[0]=CommonFactor;
        //return answer
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,12)[0]);
    }
}