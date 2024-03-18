package 피보나치수;

class Solution {
  public static int solution(int n) {
    int[] ans = new int[n];
    ans[0]=0;
    ans[1]=1;
    for (int i = 2; i <= n+1; i++) {
      ans[i] = (ans[i-1]+ans[i-2])%1234567;
    }
    return ans[n];
  }
// 100 이 넘어가면 overflow 가 일어남 막 -9123123 가 됨.....

  public static void main(String[] args) {
    System.out.println(solution(967755459));
  }
}
