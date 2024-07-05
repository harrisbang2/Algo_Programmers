package 최댓값과최솟값;

public class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        int lowest = Integer.parseInt(split[0]);
        int largest = Integer.parseInt(split[0]);

        for(String string : split){
            int temp = Integer.parseInt(string);
            if(temp>largest){
                largest = temp;
            }
            if(temp<lowest){
                lowest = temp;
            }
        }
        return lowest+" "+ largest;
    }
}
