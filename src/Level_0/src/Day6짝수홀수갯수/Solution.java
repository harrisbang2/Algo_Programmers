package Day6짝수홀수갯수;

class Solution {
    public static int[] solution(int[] num_list) {
        int[] answer = {};
        int odd=0;
        int even=0;
        for(int i =0;i<num_list.length;i++){
            if(num_list[i]%2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        answer= new int[]{even, odd};
        return answer;
    }
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,5});
    }
}