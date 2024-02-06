package DayX주사위의개수;

public class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int height = box[0]/n;
        int width = box[1]/n;
        int legth = box[2]/n;
        return height*width*legth;
    }
}
