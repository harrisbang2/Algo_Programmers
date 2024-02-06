package 부족한금액계산하기;

class Solution {
        public long solution(int price, int money, int count) {
            long answer = 0;
            if(count == 0){
                return 0;
            }
            for (int i = 0; i <= count; i++) {
                answer+=price*i;
            }
            if(answer<money){
                return  0;
            }
            answer = answer - money;
            return answer;
        }
}
