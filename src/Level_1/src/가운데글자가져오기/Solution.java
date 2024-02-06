package 가운데글자가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==1){
            int index = (s.length()-1)/2 +1;
            answer += s.charAt(index-1);
        }
        else {
            int index = s.length()/2;
            answer += s.charAt(index-1);
            answer += s.charAt(index);
        }
        return answer;
    }
}
