package 명예의전당1;

import java.util.*;

class Solution {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> rank = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            answer[i] = Collections.min(rank);
        }
        return answer;
    }

    public static void main(String[] args) {
        int []as = solution(4,new int[]{0,10,300,20,400,50});
        for(int a : as){
            System.out.println(a);
        }
    }
}