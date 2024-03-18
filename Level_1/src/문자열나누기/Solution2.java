package 문자열나누기;

public class Solution2 {
  public static int solution(String s) {
    int answer = 0;
    char init = s.charAt(0);
    int count = 0;

    //

    for (char c : s.toCharArray()) {
      System.out.println(init+" : "+c);
      /////////////////////////
      ///// 초기화 ////////
      //// 밴런스가 맞아 0 이 되면 다음 글자로 넘어갑니다.
      if (count == 0) {
        init = c;
      }
      //////////////////////
      // 같은 값이 있을때 ++
      if (init == c) {
        count++;
      }
      // 다른 값이 있을때 --
      else {
        count--;
      }

      // ((+)같은 값 vs (-)다른 값이) 밸런스를 마추는 순간. answer ++
      if (count == 0)
      {
        answer++;
      }
    }
    ///// ends

    // count 카운트가 영 일령운 ans ++
    // 이유 1.  한 글자 일경우.
    if(count > 0) {
      answer++;
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution("banana"));
  }
}
