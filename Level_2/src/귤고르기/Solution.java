package 귤고르기;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


class Solution {
  public static int solution(int k, int[] tangerine) {
    int answer = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int a : tangerine){
      map.put(a,map.getOrDefault(a,0)+1);
    }
    // map 정렬 by key
    List<Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
    entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    // 계산
    int wanted = k;
    for (int i = 0; i < entryList.size(); i++) {
      if(wanted <=0){
        break;
      }
      wanted -= entryList.get(i).getValue();
      answer++;
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] input ={1, 3, 2, 5, 4, 5, 2, 3};
    System.out.println(solution(6,input));
  }
}
