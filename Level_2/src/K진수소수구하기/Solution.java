package K진수소수구하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public static int solution(int n, int k) {
    int answer = 0;
    // base 진수 구하기
    String binary = Integer.toString(n, k);

    // 0 을 가 나누기
    String[] nums = binary.split("0");

    // 검사
    for (String s: nums) {
      if (s.equals("")) {
        continue;
      }
      if (primeChecker(Long.parseLong(s)))
        answer++;
    }
    return answer;
  }

  public static boolean primeChecker(Long n){
    if(n==1)
      return false;

    for (long i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(solution(437674,3));
  }
}


///
