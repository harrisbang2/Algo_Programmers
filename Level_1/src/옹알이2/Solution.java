package 옹알이2;

class Solution {
  public static int solution(String[] babbling) {
    int answer = 0;
    String[] str = {"aya", "ye", "woo", "ma"};
    String[] repeatStr = {"ayaaya", "yeye", "woowoo", "mama"};
    for(int i=0; i<babbling.length; i++){
      for(int j=0; j<str.length; j++){
        babbling[i] = babbling[i].replace(repeatStr[j], "1").replace(str[j], " ");
      }
      if(babbling[i].trim().isEmpty()){
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String []input = {"aya", "yee", "u", "maa"};
    System.out.println(solution(input));

  }
}
