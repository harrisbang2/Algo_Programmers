package 햄버거만들기;

import java.util.Stack;

public class Solution {
  public static int solution(int[] ingredient) {
    int answer = 0;

    Stack<Integer> integerStack = new Stack<>();
    for (int i :ingredient) {
      integerStack.push(i);

      if(integerStack.size() >3){

        if(integerStack.get(integerStack.size()-4)==1
        &&integerStack.get(integerStack.size()-3)==2
            && integerStack.get(integerStack.size()-2)==3
            &&integerStack.get(integerStack.size()-1)==1
        ){
          answer++;
          integerStack.pop();
          integerStack.pop();
          integerStack.pop();
          integerStack.pop();
        }

      }
      //


    }
    return answer;
  }
  public static void main(String[] args) {
    int[] a = {2, 1, 1, 2, 3, 1, 2, 3, 1};
    System.out.println(solution(a));
  }
}
