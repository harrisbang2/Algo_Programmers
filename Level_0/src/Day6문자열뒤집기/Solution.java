package Day6문자열뒤집기;

class Solution {
    public static String solution(String my_string) {
        String answer = "";
        String []splited = new String[my_string.length()];
        splited = my_string.split("");
        for(int i = my_string.length()-1;i>=0;i--){

            answer += splited[i];
            System.out.println(splited[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("cat");
        System.out.println(solution("cat"));
    }
}
