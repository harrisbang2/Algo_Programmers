package 의상;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Solution {
  public static int solution(String[][] clothes) {
    int answer = 1;
    HashMap<String,Integer> themap = new HashMap<>();
    // 각각의 갯수 확인
    for (int i = 0; i < clothes.length; i++) {
      String key = clothes[i][1];

      if(!themap.containsKey(key)){
        themap.put(key,1);
//        System.out.println("키 증복");
      }
      else {
        themap.put(key, themap.get(key) + 1);
      }
    }

    // 하ㅏㅏㅏ
    for (Entry<String, Integer> entry : themap.entrySet()) {
      String keys = entry.getKey();
      String value = String.valueOf(entry.getValue());
//      System.out.println(keys + value);
//      System.out.println(themap.size());
      // Do something with key and value
    }
    Iterator<String> keys = themap.keySet().iterator();
    while( keys.hasNext() ){
      String key = keys.next();
      answer *= themap.get(key)+1;
    }
    answer -= 1;
    return answer;
  }

  public static void main(String[] args) {
    String[][] input = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    System.out.println(solution(input));
  }
}
