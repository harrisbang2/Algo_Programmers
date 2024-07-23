package 요격시스템;

import java.util.Arrays;

//끝나는 구간을 오름차순으로 정렬하고, 한 범위에 대해서 최대한 뒤쪽에 요격 하면 이후의 범위에 최대한 들 수 있다.
//구간들을 순회하면서, 현재까지의 가장 마지막 요격 지점이 현재 구간에 포함되면 현재 구간을 무시해도 되기 때문에 다음 순회로 넘어간다.
//양쪽이 개구간이라는 것이 유의할 점이다.
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, (o1, o2) -> { return o1[1]-o2[1]; });

        int last = -1;
        for (int[] target : targets) {
            if (last == -1) {
                answer++;
                last = target[1] - 1;
                continue;
            }

            if (last >= target[0] && last <= target[1]) continue;

            answer++;
            last = target[1] - 1;
        }

        return answer;
    }
}
