package DayX약수구하기;

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int size = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                size++;
            }
        }
        answer = new int[size];
        int temp =0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                answer[temp]=i;
                temp++;
            }
        }
        return answer;
    }
}
