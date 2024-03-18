package 문자열나누기;

public class Solution {
  public static int solution(String s) {
    int answer = 0;
    char front = s.charAt(0);
    int same = 0;
    int diff = 0;

    //
    for(int i = 0 ; i < s.length() ; i++){
      char ch = s.charAt(i);

      // 같으면 same ++ 아니면 diff ++
      if(front == ch){
        same++;
      }else{
        diff++;
      }

      // 두 숫자가 같으면 초기화 answer ++
      if(same == diff){
        answer++;
        same = 0;
        diff = 0;

        // 근대 만약에 i 다음글자가 가 s 끝이 아니 라면 다음 글자로 넘어감
        if(i+1 < s.length()){
          front = s.charAt(i+1);
        }
      }


      /// 혹은 현제 글자가 마지막 혼자남은 글자일 경우 -> answer++
      else if(i == s.length()-1){
        answer++;
      }
    }
    //
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution("banana"));
  }
}
