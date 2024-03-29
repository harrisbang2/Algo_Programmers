package 시추석유;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
// 가로 길이 세로 길이
  static int n,m;
  static int[] oil;
  public int solution(int[][] land) {
    int answer = 0;

    n = land.length; // 높이
    m = land[0].length; // 길이
    oil = new int[m];

    boolean [][] visited = new boolean[n][m]; // 방문 처리용

    // 땅들을 land[][] 하나하나 검사.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        /////
        // 만약에 visted 가 아니고, 기름이 있으면!
        /////
        if(land[i][j] == 1 && !visited[i][j]){
          bfs(land,visited,i,j);
        }

      }
    }

    answer = Arrays.stream(oil).max().getAsInt();
    System.out.println(answer);
    return answer;
  }

  private void bfs(int[][] land, boolean[][] visited, int i, int j) {
    // queue 를 사용 ques 안에 int[] 배열
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{i,j});
    visited[i][j] = true; // 방문 처리

    // 상, 하, 좌, 우 이동 ?????????????
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    // 석유 덩어리 개수
    int count = 1;

    // 석유 덩어리의 위치 저장
    Set<Integer> set = new HashSet<>();

    while (!q.isEmpty()){ //? queue 가 비워 질때 까지 poll?
      int[] now = q.poll(); // 지금
      set.add(now[1]);
      
      //////////////
      for (int k = 0; k < 4; k++) { //? 왜 4인가

        int nx = now[0]+dx[k];
        int ny = now[1]+dy[k];

        // 땅 버서나면 생략
        if(!checkrange(nx, ny)){
          continue;
        }
        /// 빈땅이거나 방문한적있는 경우!!!
        if(land[nx][ny]==1 && !visited[nx][ny]){

          q.add(new int[]{nx,ny});
          visited[nx][ny] = true;
          count ++;

        }
      }
    }
    for (int index : set) {
      oil[index] += count;
    }
  }
  /// 검색 하다가 땅 벗어나면 오류나는지.
  private boolean checkrange(int nx, int ny) {
    if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
      return false;
    }
    return true;
  }
  }
