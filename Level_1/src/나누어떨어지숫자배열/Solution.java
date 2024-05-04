package 나누어떨어지숫자배열;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(solution(new int[]{1,4,3,2,5},2)[i]);
        }
    }
}
