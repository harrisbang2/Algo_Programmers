package 행열의곱셈;

class Solution {
  public static int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = new int[arr1.length][arr2[0].length];
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2[0].length; j++) {
        int temp = 0;
        for (int a = 0; a < arr2.length; a++) {
          temp += arr1[i][a] * arr2[a][j];
      }
        answer[i][j] = temp;
    }
    }

    return answer;
  }

  public static void main(String[] args) {
    int [][]input1 = {{1, 4}, {3, 2}, {4, 1}};
    int [][]input2 = {{3, 3}, {3, 3}};
    System.out.println(input2[0].length);
    int ans[][] = solution(input1,input2);
    for(int [] a : ans){
      for (int b : a){
        System.out.println(b);
      }
    }
  }
}
