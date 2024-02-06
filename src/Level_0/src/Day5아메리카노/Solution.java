package Day5아메리카노;

public class Solution {
    public int[] solution(int money) {
        int a = money / 5500;
        int b = money % 5500;
        return new int[] { a, b };
    }
    //
    public static void main(String[] args) {
        Solution a = new Solution();
        //System.out.println(a.solution(5500)[0]);
        System.out.println(a.solution(5500)[0]);
        System.out.println(a.solution(5500)[1]);
        System.out.println(a.solution(15000)[0]);
        System.out.println(a.solution(15000)[1]);
    }
}


