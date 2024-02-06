package DayXn의배수고르기;

public class Solution {
    public static int[] solution(int n, int[] numlist) {
        int b =0;
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n==0) {
                b++;
            }
        }
        int[] answer = new int[b];
        b = 0;
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n==0) {
                answer[b] = numlist[i];
                b++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int []a = solution(5,new int[]{1, 9, 3, 10, 13, 5,3,10});
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
