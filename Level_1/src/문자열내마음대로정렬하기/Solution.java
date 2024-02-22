package 문자열내마음대로정렬하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static String[] solution(String[] strings, int n) {
        String[] answer = strings;
        ArrayList<String> ls = new ArrayList<>();
        for (String s : answer) {
            ls.add(s.charAt(n)+s);
        }
        Collections.sort(ls);
       for (int i = 0; i < ls.size(); i++) {
            answer[i] = ls.get(i).substring(1);
        }
        return answer;
    }
//
public static void main(String[] args) {
        String []a = {"car", "bed", "sun"};
        String []b = solution(a,1);
    System.out.println(b[0]);
    System.out.println(b[1]);
    System.out.println(b[2]);
}
}


