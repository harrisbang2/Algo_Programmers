package DayX삼각형의완성조건;

public class Solution {
    public static int solution(int[] sides) {
        int big =0;
        int rest =0;
        int count =0;
        for (int i = 0; i <= 2; i++) {
            if(big<sides[i]){
                big = sides[i];
            }
        }
        for (int i = 0; i <= 2; i++)
        {
            if (sides[i]!=big || count>0)
            {
                rest += sides[i];
            }
            else count++;
        }
        if(rest>big){
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        solution(new int[] {1,2,3});
        System.out.println( solution(new int[] {199,72,222}));
    }
}
