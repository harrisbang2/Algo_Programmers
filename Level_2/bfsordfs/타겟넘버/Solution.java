package 타겟넘버;



class Solution{
  static int answer = 0;
  public int solution(int[] numbers, int target) {
    dfs(numbers, 0, target, 0);

    return answer;
  }

  // 깊이 우선 탐색
  public void dfs(int[] numbers, int  count, int target, int sum){
    if(count == numbers.length){ // 마지막 노드 까지 탐색한 경우
      if(target == sum) answer++;
    }
    else {
      dfs(numbers, count + 1, target, sum + numbers[count]); // 해당 노드의 값을 더하고 다음 깊이 탐색
      dfs(numbers, count + 1, target, sum - numbers[count]); // 해당 노드의 값을 빼고 다음 깊이 탐색
    }
  }
}

