package 피로도;



class Solution {
  static boolean[] visited;
  static int answer = 0;
  public static int solution(int k, int[][] dungeons) {
    ///bfs ? dfs?
    visited = new boolean[dungeons.length];
    int counter = dfs(dungeons,k,visited,0);
    return counter;
  }
  public static int dfs(int[][] dungeons, int k, boolean[] history, int count){
    for (int i = 0; i < dungeons.length; i++) {
      if(!history[i] && k >= dungeons[i][0]){
        history[i] = true;
        dfs(dungeons,k - dungeons[i][1], history, count + 1);
        history[i] = false;
      }
    }
    answer =  Math.max(answer, count);
    return answer;
  }
  public static void main(String[] args) {
    int k = 80;
    int [][]d ={{80,20},{50,40},{30,10}};
    System.out.println(solution(k,d));
  }
}
