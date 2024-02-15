package 과일장수;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> ls = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (int i = 0; i < ls.size(); i++) {
            if((i+1)%m ==0)
                answer+= m*ls.get(i);
        }
        return answer;
    }
}
