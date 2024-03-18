package 대충만든자판;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
  public static int[] solution(String[] keymap, String[] targets) {
    int[] answer = {};
    List<Integer> ls = new ArrayList<>();
    for (String s : targets){
       ls.add(NumberOfClicks(keymap,s));
    }
    answer = ls.stream().mapToInt(Integer::intValue).toArray();
    return answer;
  }

  private static Integer NumberOfClicks(String[] keymap, String s) {
    int num =0;

    HashMap<Character,Integer> keyboardmap = new HashMap<>();

    for (String k : keymap){
      for (int i = 0; i < k.length(); i++) {
        if(!keyboardmap.containsKey(k.charAt(i))|| keyboardmap.get(k.charAt(i))>i+1){
          keyboardmap.put(k.charAt(i),i+1);
        }
      }
    }

//    for (Character key : keyboardmap.keySet()) {
//      Integer value = keyboardmap.get(key);
//      System.out.println("key : " + key + ",    value : " + value + "\n");
//    }

    for (int i = 0; i < s.length(); i++) {
      if(!keyboardmap.containsKey(s.charAt(i))){
        return -1;
      }
      num += keyboardmap.get(s.charAt(i));
    }
    ////////////////////
    return num;
  }


  public static void main(String[] args) {
    String[] a ={"ABACD", "BCEFD"};
    String[] b = {"ABCD","AABB"};
    for(int i : solution(a, b))
    System.out.println(i);
  }
}

