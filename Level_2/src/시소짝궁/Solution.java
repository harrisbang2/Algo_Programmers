package 시소짝궁;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

class Solution {
  public static long solution(int[] weights) {
    long answer = 0;
    Map<Long, Long> weightCount = new HashMap<>(); // 각 무게의 등장 횟수
    Map<Long, Long> ForceCalculationMap = new HashMap<>();   //  * 2 3 4
    for (long weight : weights) {
      // 무게의 등장 횟수
      // 없으면 0 +1 있으면 있는거 +1
      weightCount.put(weight, weightCount.getOrDefault(weight, 0L) + 1);
      // 시소 거리 에 따른 무게들 계산
      Long[] possibleWeights = {weight * 2, weight * 3, weight * 4};
      // 모든 거리 * 무게 의 힘 저장
      for (Long w : possibleWeights) {
        ForceCalculationMap.put(w, ForceCalculationMap.getOrDefault(w, 0L) + 1);
      }
    }
    // 짝꿍의 수를 계산합니다.
    for (Long count : ForceCalculationMap.values()) {
      if (count > 1) {
        // 짝(갯수) 마추기.
        answer += count * (count - 1) / 2;
      }
    }

    // 중복으로 들어간 값들을 제거
    Long minus = 0L;
    for (Long count : weightCount.values()) {
      if(count > 1){
        //
        minus += ( count * (count - 1) / 2)*2;
      }
    }
    return answer - minus;
  }
  //
  public static void main(String[] args) {
    int[] input ={100,180,360,100,270};
    System.out.println(solution(input));
  }
}
