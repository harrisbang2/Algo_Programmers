package DayX가장큰수찾기;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        int temp=array[0];
        for (int i = 0; i < array.length; i++) {
            if(temp<array[i]){
                temp = array[i];
                answer = new int[]{temp,i};
            }
        }
        return answer;
    }
}
