package DayX문자열정렬하기;

public class Solution {
    public static String solution(String my_string) {
        String answer = "";
        char []split = new char[my_string.length()];
        //char 배열에 넣기
        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if(temp<='Z'){
                temp+=32;
            }
            split[i] = temp;
        }
        //
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                if(split[j]>split[i]){
                    char temp = split[j];
                    split[j] = split[i];
                    split[i] = temp;
                }
            }
        }
        //
        for (int i = 0; i < split.length; i++) {
            answer+=split[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCd"));
    }
}
