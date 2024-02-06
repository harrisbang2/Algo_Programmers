package DayX정수내림차순;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
public class Solution {
    public static long solution(long n) {
        String a = String.valueOf(n);
        long answer = 0;
        String [] s = a.split("");
        int [] temp = new int[s.length];
        // 넣기
        for (int i = 0; i < temp.length; i++) {
            temp[i]= parseInt(s[i]);
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if(temp[j]<temp[i]){
                    int mem = temp[i];
                    temp[i] = temp[j];
                    temp[j] = mem;
                }
            }
        }
        a="";
        for (int i = 0; i < temp.length; i++) {
            a += temp[i];
        }
        return parseLong(a);
    }

    public static void main(String[] args) {
        System.out.println(solution(4321200));
    }
}
