package DayXA로B만들기;

public class Solution {
    public static int solution(String before, String after) {
        String[] b = before.split("");
        String[] a= after.split("");
        int count =0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(!a[j].equals("XX")&&b[i].equals(a[j])){
                    b[i] ="XX";
                    a[j] ="XX";
                    count++;
                }
            }
        }
        int ans = before.length()==count ? 1:0;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution("sehun","hunse"));
    }
}
