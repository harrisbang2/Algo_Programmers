package 추억점수;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length-1];
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i],yearning[i]);
        }
        int index = 0;
        for (String[] s : photo) {
            for (String a : s){
                if(map.containsKey(a)){
                    answer[index] += map.get(a);
                }
            }
            index++;
        }
        return answer;
    }
}
