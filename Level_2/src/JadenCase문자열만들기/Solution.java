package JadenCase문자열만들기;

class Solution {
  public static String solution(String s) {
    String answer = "";
    String[] st = s.split(" ");

    for (String a : st){
      if (s.isEmpty()) answer += " ";
      for (int i = 0; i < a.length(); i++) {
        char c = a.charAt(i);
        if(i==0 && c > 'Z') c = (char) (c - 32);
        if(i>0 && c < 'a'){
          c = (char) (c + 32);
        }
        answer+=c;
      }
      answer+=" ";
    }
    var ans = answer.lastIndexOf(" ");
    if(s.charAt(s.length() - 1) == ' ') return answer;
    answer = answer.substring(0,ans);
    return answer;
  }
//
//public static String solution(String s) {
//  String answer = "";
//  String[] st = s.split(" ");
//
//  for (String temp : st) {
//    if (temp.isEmpty())
//      answer += " ";
//    else {
//      answer += temp.substring(0, 1).toUpperCase();
//      answer += temp.substring(1, temp.length()).toLowerCase();
//      answer += " ";
//    }
//  }
//  if(s.charAt(s.length() - 1) == ' ') return answer;
//  answer = answer.substring(0, answer.length() - 1);
//  return answer;
//}
  public static void main(String[] args) {
    System.out.println(solution("for the last week"));
  }
}
