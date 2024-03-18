package 체육복;

class Solution {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;
    int count1 = 0;
    int count2 = 0;

    for(int i=0; i<lost.length; i++) {
      for(int j=0; j<reserve.length; j++) {
        //여벌옷이 있는 학생이 도난당했을 경우
        if(lost[i]==reserve[j]) {
          reserve[j] = -1;
          lost[i] = -1; //빌릴 필요 없음
          count1++;
          break;
        }
      }
    }

    for(int i=0; i<lost.length; i++) {
      for(int j=0; j<reserve.length; j++) {
        //여벌옷이 없는 학생이 도난당했을 경우
        if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
          reserve[j] = -1;
          count2++;
          break;
        }
      }
    }
    answer = n - lost.length + count1 + count2;

    return answer;
  }
}