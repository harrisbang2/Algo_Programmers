package Day9모스부호1;

public class Solution {
    public static String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String []letterbreakdown =letter.split(" ");
        for(String s : letterbreakdown){
            for (int i = 0; i < morse.length; i++) {
                if(s.equals(morse[i])){
                    System.out.println(morse[i]);
                    answer += Character.toString(i+97);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
