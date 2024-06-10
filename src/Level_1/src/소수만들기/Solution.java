package 소수만들기;

class Solution {
    public static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum +=nums[j];
                if(isPrime(sum)){
                    answer++;
                }
                sum = 0;
            }
        }
        return answer;
    }static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
    }
}