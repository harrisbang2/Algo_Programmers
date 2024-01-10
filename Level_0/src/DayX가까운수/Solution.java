package DayX가까운수;

public class Solution {
    public static int solution(int[] array, int n) {
        int answer = array[0];
        int close = n - array[0];
        if (close < 0){
            close *= -1;
        }
        for (int i = 0; i < array.length; i++) {
            int temp = n - array[i];
            if (temp < 0){
                temp *= -1;
            }
            if(temp<close){
                close= temp;
                answer = array[i];
            }
            // 차이가 같을경우 더 작은수
            if(temp==close){
                if(answer>array[i]){
                    answer = array[i];
                }
            }
        }
        return answer;
    }
//    public static int solution(int[] array, int n) {
//        int answer =array[0];
//
//        return answer;
//    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6,2,3,4,5},5));
    }
}
