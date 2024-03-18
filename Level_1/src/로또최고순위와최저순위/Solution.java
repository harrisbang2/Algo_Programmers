package 로또최고순위와최저순위;

class Solution {
  public static int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = {0,0};
    for (int i = 0; i < win_nums.length; i++) {
      if(lottos[i]==0){
        answer[0]++;
        continue;
      }
        for (int j = 0; j < win_nums.length; j++) {
          if(lottos[j]==win_nums[j]){
            answer[0]++;
            answer[1]++;
          }
        }
      }

    for (int i = 0;i<2;i++){
      switch (answer[i]){
        case 2 -> answer[i]=5;
        case 3 -> answer[i]=4;
        case 4 -> answer[i]=3;
        case 5 -> answer[i]=2;
        case 6 -> answer[i]=1;
        default -> answer[i]=6;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int []looto = {45, 4, 35, 20, 3, 9};
    int []win ={20, 9, 3, 45, 4, 35};
    System.out.println(solution(looto,win)[0]);
    System.out.println(solution(looto,win)[1]);
  }
}
