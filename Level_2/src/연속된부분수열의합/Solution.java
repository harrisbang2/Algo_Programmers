package 연속된부분수열의합;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public static int[] solution(int[] sequence, int k) {
    int[] answer = new int[2];
    int[] extendedSequence = new int[sequence.length + 1];
    System.arraycopy(sequence, 0, extendedSequence, 0, sequence.length);
    extendedSequence[sequence.length] = 0;

    Deque<Integer> q = new ArrayDeque<>();
    int sum = 0;
    int start = 0, end = 0;
    int result = sequence.length;

    for (int i = 0; i < extendedSequence.length; i++) {
      while (sum > k) {

        int temp = q.pollFirst();
        sum -= temp;
        start++;

      }

      if (sum == k && end - start < result) {
        answer[0] = start;
        answer[1] = end;
        result = end - start;
      }

      q.offerLast(extendedSequence[i]);
      sum += extendedSequence[i];
      end = i;
    }

    // return answer
    return answer;
  }

  public static void main(String[] args) {
    int[] input = {1, 2, 3, 4, 5};
    int k = 7;
    int []ans = solution(input,k);
//    for (int i : ans) {
//      System.out.println(i);
//    }
  }
}
