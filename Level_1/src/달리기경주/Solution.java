package 달리기경주;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public static String[] solution(String[] players, String[] callings) {
    String[] answer = {};
    HashMap<String,Integer> ans = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      ans.put(players[i], i);
    }

    for (String c : callings){
      int grade = ans.get(c);
      String forwardCalling = players[grade - 1];
      players[grade - 1] = c;
      ans.put(c, grade - 1);
      players[grade] = forwardCalling;
      ans.put(forwardCalling, grade);
    }
    return players;
  }

  public static void main(String[] args) {
    String[] players ={"mumu", "soe", "poe", "kai", "mine"};
    String[] callings ={"kai", "kai", "mine", "mine"};

    for (String s : solution(players,callings))
    {
      System.out.println(s);
    }
      ;


  }
}