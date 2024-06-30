package 같은숫자는싫어;

import java.util.*;

public class Solution {
    public Integer[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for(int a : arr){
            if(index==0||list.get(index-1)!= a){
                list.add(a);
                index++;
            }
        }

        return list.toArray(new Integer[0]);
    }
}
