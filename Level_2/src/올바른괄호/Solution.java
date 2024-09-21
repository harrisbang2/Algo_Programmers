package 올바른괄호;

import java.util.Stack;

class Solution {
    static boolean solution(String s) {
        long length = s.length();
        Stack<Character> stack = new Stack<>();
        try {
            for (int i = 0; i < length; i++) {
                if(s.charAt(i)=='(') stack.push(s.charAt(i));
                else stack.pop();
            }
        }catch (Exception e){
            return false;
        }
        if(stack.size()==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()("));
    }
}
