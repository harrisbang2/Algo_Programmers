package DayX진료순서정하기;

import java.util.HashMap;

public class Solution {
    public static int[] solution(int[] emergency) {
        int max = emergency.length;
        int[] answer = new int[max];
        for (int i = 0; i < max; i++) {
            answer[i] = emergency[i];
        }
        int[] sortedNum= emergency;
        // sort but big comes first
        for (int i=max-1;i>=0;i--){
            for (int k=max-1;k>=0;k--)
                if(sortedNum[i]<sortedNum[k]){
                    int mem = sortedNum[k];
                    sortedNum[k]=sortedNum[i];
                    sortedNum[i]=mem;
                }
        }
        // loop the emergency again and add num
        for (int i = max-1; i >= 0; i--) {
            for (int j = 0; j < max; j++) {
                int temp = j+1;
                if(answer[i]==sortedNum[j]){
                   // System.out.println(map.get(temp));
                    answer[i]=j+1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.print(solution(new int[]{50, 1, 3, 4, 5, 6, 7})[i]);
        }
    }
}
