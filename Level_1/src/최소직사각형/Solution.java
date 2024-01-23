package 최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        int big=0;
        int samll = 0;
        for (int i = 0; i < sizes.length; i++) {
            int v = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            big = Math.max(big,v);
            samll=Math.max(samll,h);
        }
        return big*samll;
    }
}