package DayX2차원으로만들기;

public class Solution {
    public static int[][] solution(int[] num_list,int n) {
        int num = num_list.length%n==0 ? num_list.length:num_list.length+1;
        int[][] answer = new int[num/2][n];
        int temp =0;
        for (int i = 0; i < num_list.length; i++) {
            if(temp >= num_list.length){
                break;
            }
            for (int k = 0; k < n; k++) {
                if(temp >= num_list.length){
                    break;
                }
                answer[i][k] = num_list[temp];
                temp++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(solution(new int []{1,2,3,4,5,6},2)[i][j]);
            }
            System.out.println("");
        }

    }
}
