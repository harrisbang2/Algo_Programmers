package DayX바탕화면정리;

public class Solution {
  public static int[] solution(String[] wallpaper) {
    int y1=Integer.MAX_VALUE;
    int x1=Integer.MAX_VALUE;
    int y2 =0;
    int x2 = 0;
    // 2 중 배열 루프
    for (int i = 0; i < wallpaper.length; i++) {
      // y 축
      for (int j = 0; j < wallpaper[0].length(); j++) {
      // x 축
        if(wallpaper[i].charAt(j) == '#'){
          // 최대 최소
          y1 = Math.min(y1,i);
          y2 = Math.max(y2,i);
          x1 = Math.min(x1,j);
          x2 = Math.max(x2,j);
        }
      }
    }
    // (y,x,y2,x2) 로 제출
    int[] answer = {y1,x1,y2+1,x2+1};
    return answer;
  }
}
