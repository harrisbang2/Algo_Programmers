package 카드뭉치;

public class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Index = 0;
        int card2Index=0;
        //목표를 iterate 함
        for (String s : goal){
            // 카드 1 에 있는 경우 카드를 뺌.
            if(cards1[card1Index].equals(s)){
                if(!(card1Index==cards1.length-1)){
                    card1Index++;
                }
            }
            else if (cards2[card2Index].equals(s)) { //카드 2에 있는 경우
                if(!(card2Index==cards2.length-1)){
                    card2Index++;
                }
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        String[] cards1={"i", "drink", "water"};
        String[] cards1fail={"i", "water", "drink"};
        String[] cards2={"want", "to"};
        String[] goal={"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1,cards2,goal));
        System.out.println(solution(cards1fail,cards2,goal));
    }
}
