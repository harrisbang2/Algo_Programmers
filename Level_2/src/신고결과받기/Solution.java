package 신고결과받기;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Solution2 {
  public static int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];

    HashMap<String,Integer> playerReportedNum =new HashMap<>();
    HashMap<String, Set<String>> playerReportHistory = new HashMap<>();
    HashMap<String,Integer> finalreport = new HashMap<>();
    Set<String> banlist = new HashSet<>();
    //유저 분리
    for (String s : id_list) {
      finalreport.put(s,0);
      playerReportedNum.put(s,0);
      playerReportHistory.put(s, new LinkedHashSet<>() {
      });
    }
    // 유저가 신고한 유저들 정리
    for (String s : report) {
      // 무자 나누기
      String []split = s.split(" ");
      Set<String> temp = playerReportHistory.get(split[0]);
      temp.add(split[1]);
      playerReportHistory.put(split[0],temp);
    }

    for ( Map.Entry<String, Set<String>> entry : playerReportHistory.entrySet()) {
      String key = entry.getKey();
      Set<String> tab = entry.getValue();
      System.out.println(key + " : "+tab.size());
      for (String re :tab){
        finalreport.put(re,finalreport.getOrDefault(re,0)+1);
        if(finalreport.get(re) >= k)
          banlist.add(re);
      }
    }
    int index = 0;
    for ( String temp : id_list) {
      for (String temp32 : banlist)
        if(playerReportHistory.get(temp).contains(temp32)){
        answer[index]++;
      }
      index++;
    }
    return answer;
  }

//  public static void main(String[] args) {
//    int ans[] = solution(
//        new String[]{"muzi", "frodo", "apeach", "neo"},
//        new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},2);
////    int ans2[] = solution(
////        new String[]{"con", "ryan"},
////        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},3);
//    for (int i : ans) {
//      System.out.println(i);
//    }
//  }
}
