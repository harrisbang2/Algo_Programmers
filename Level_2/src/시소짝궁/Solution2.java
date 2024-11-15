package 시소짝궁;

public class Solution2 {
  public long solution(int[] weights) {
    long answer = 0;
    // 몸무게 개수 측정
    long[] arr = new long[1001];
    for(int i = 0; i < weights.length; i++){
      arr[weights[i]]++;
    }


    //
    for(int i = 100; i < 1001; i++){
      // 해당 몸무게가 없으면 스킵.
      if(arr[i] == 0) continue;

      answer += (arr[i] * (arr[i] - 1)) / 2;

      if((4 * i) / 3 > 1000) continue;
      if(i % 3 == 0){
        answer += arr[i] * arr[(4 * i) / 3];
      }

      if((3 * i) / 2 > 1000) continue;
      if(i % 2 == 0){
        answer += arr[i] * arr[(3 * i) / 2];
      }

      if(2 * i >1000) continue;
      answer += arr[i] * arr[2 * i];
    }

    return answer;
  }
}
