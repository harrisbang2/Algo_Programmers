package DayX정수제곱판별;

import java.math.BigInteger;

class Solution {
    public static long solution(long n) {
        double result = Math.sqrt(n);
        if(result == (int)result){
            return (long) Math.pow(result+1,2);
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(solution(400000000));
    }
}
//class Solution {
//    public long solution(long n) {
//        for (int i = 1; i < n/10; i++) {
//            if(i*i==n){
//                return (i+1)*(i+1);
//            }
//        }
//        return -1;
//    }
//}
