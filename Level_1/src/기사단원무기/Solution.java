package 기사단원무기;

class Solution {
  public int solution(int number, int limit, int power) {
    int answer = 0;
    for (int i = 1; i <= number; i++) {
      int count =0;
      //약수 구하기.
      for (int j = 1; j*j<= i; j++) {
        if(j*j==i) count++;
        else if(i%j==0) count+=2;
      }
      //공격력 비교하기.
      answer += count>limit ? power : count;
    }
    return answer;
  }
}
