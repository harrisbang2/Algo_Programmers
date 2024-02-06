package 하샤드수;

import static java.lang.Integer.parseInt;

public class Solution {
    public boolean solution(int x) {
        String input = String.valueOf(x);
        String []split = input.split("");
        int adder =0;
        for (int i = 0; i < split.length; i++) {
            adder += parseInt(split[i]);
        }
        return x%adder==0;
    }
}
