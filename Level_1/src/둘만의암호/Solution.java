package 둘만의암호;

class Solution {
  public static String solution(String s, String skip, int index) {
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char word = s.charAt(i);

      for (int j = 0; j < index; j++) {
        word++;
        if(word > 'z'){
          word-=26;
        }
        if(skip.contains(String.valueOf(word))){
          word++;
        }
      }

      answer.append(word);
    }
    return answer.toString();
  }

  public static void main(String[] args) {
    System.out.println(solution("aukks","wbqd",5));
  }
}
