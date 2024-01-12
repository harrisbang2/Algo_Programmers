package 삼총사;

public class Solution {
    public static int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if(j==k||j==i||i==k){
                        System.out.println(k+":"+j+":"+i+"thesame");
                    }
                    else {
                        if (number[i]+number[k]+number[j]==0){
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {-2, 3, 0, 2, -5};
        System.out.println(solution(a));
    }
}
