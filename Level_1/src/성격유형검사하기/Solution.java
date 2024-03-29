package 성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public static String solution(String[] survey, int[] choices) {

    //1 - 7 비동의 - 동의
    int []agree= {0,-3,-2,-1,0,1,2,3};
    String answer = "";
    HashMap<String,Integer> map = new HashMap<>();
    map.put("R",0);
    map.put("T",0);
    map.put("C",0);
    map.put("F",0);
    map.put("J",0);
    map.put("M",0);
    map.put("A",0);
    map.put("N",0);
    int index = 0;
    for(String s : survey){
      char temp = s.charAt(1);
      map.put(String.valueOf(temp),map.getOrDefault(String.valueOf(temp),0)+agree[choices[index]]);
      index++;
    }
    //
    for ( Map.Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      Integer tab = entry.getValue();
      System.out.println(key + " : "+tab);
    }
    //
    int firstresult = map.get("R") - map.get("T");
    int secondresult = map.get("C")-map.get("F");
    int thirdresult = map.get("J")-map.get("M");
    int lastresult = map.get("A")-map.get("N");
    System.out.println(firstresult);
    System.out.println(secondresult);
    System.out.println(thirdresult);
    System.out.println(lastresult);
    if(firstresult>=0){
      answer += "R";
    }else {
      answer += "T";
    }
    //
    if(secondresult>=0){
      answer += "C";
    }else {
      answer += "F";
    }
    //
    if(thirdresult>=0){
      answer += "J";
    }else {
      answer += "M";
    }
    //
    if(lastresult>=0){
      answer += "A";
    }else {
      answer += "N";
    }
    return answer;
  }

//  public static void main(String[] args) {
//    String []survet ={"AN", "CF", "MJ", "RT", "NA"};
//    int[] choices={5, 3, 2, 7, 5};
//    System.out.println(solution(survet,choices));
//  }
}
