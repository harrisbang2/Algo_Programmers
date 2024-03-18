package 뒤에있는큰수;

import java.util.HashMap;
import java.util.Stack;

class Solution {
  public static int[] solution(int[] numbers) {
    Stack<Integer> stack= new Stack<>();

    int[] answer = new int[numbers.length];

    for (int i =numbers.length-1; i >= 0; i--) {
      while (!stack.isEmpty()) {
        if(numbers[i]>=stack.peek()){
          stack.pop();
        }
        else {
          answer[i] = stack.peek();
          break;
        }
      }
      if (stack.empty()) {
        answer[i] = -1;
      }
      stack.push(numbers[i]);
    }
    return answer;
  }

  public static void main(String[] args) {
    int []input = {9, 1, 5, 3, 6, 2};
    int []ans = solution(input);

    for (int a : ans){
      System.out.printf(a +" ,");
    }
  }
  }