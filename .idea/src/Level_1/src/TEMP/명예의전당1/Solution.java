package Level_1_TEMP.명예의전당1;

import java.util.*;

class Solution {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            answer[i] = Collections.min(rank);
        }
        return answer;
    }
}