package 숫자짝궁;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Solution {
  public static String solution(String X, String Y) {
    String ans = "";
    HashMap<Integer, Integer> xmap = new HashMap<>();
    HashMap<Integer, Integer> ymap = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    // initial data 넣기
    for(String data : X.split("")){
      int cur = Integer.parseInt(data);
      xmap.put(cur, xmap.getOrDefault(cur, 0) + 1);
    }

    for(String data : Y.split("")){
      int cur = Integer.parseInt(data);
      ymap.put(cur, ymap.getOrDefault(cur, 0) + 1);
    }

    //// 계산
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i <= 9; i++) {
      if(xmap.containsKey(i)&&ymap.containsKey(i)){
        int count = Math.min(xmap.get(i),ymap.get(i));
        for (int j = 0; j < count; j++) {
          sb.append(i);
        }
      }
    }
    ans = sb.reverse().toString();
    if(ans.startsWith("0")){
      return "0";
    }
    else if(ans.equals("")){
      return "-1";
    }
    return ans;
  }

//  public static void main(String[] args) {
//  String x = "100";
//  String y = "123450";
//
//    System.out.println(solution(x,y));
//  }
}