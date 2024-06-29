package 완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(String s : participant){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : completion){
            map.put(s,map.get(s)-1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()>0){
                answer.append(entry.getKey());
            }
        }
        return answer.toString();
    }
}
