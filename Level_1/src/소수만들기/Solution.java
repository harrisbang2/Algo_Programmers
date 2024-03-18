package 소수만들기;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int number = nums[i]+nums[j]+nums[k];
                    if(isprime(number)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isprime(int number) {
        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
