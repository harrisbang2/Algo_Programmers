package DayX개미군단;

public class Solution {
    public static int solution(int hp) {
        int Sargent = hp/5;
        int Corperal = (hp-(Sargent*5))/3;
        int private_solders = hp-(Sargent*5)-Corperal*3;
        return Sargent+private_solders+Corperal;
    }

    public static void main(String[] args) {
        System.out.println(solution(999));
    }
}
