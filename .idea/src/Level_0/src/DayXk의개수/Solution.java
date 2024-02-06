package DayXk의개수;

public class Solution {
//public static int solution(int i, int j, int k) {
//        int answer = 0;
//        for (int l = i; l <= j; l++) {
//            if(String.valueOf(l).contains(String.valueOf(k))||k==l){
//                System.out.println(l);
//                answer++;
//            }
//        }
//        return answer;
//    }

    public static int solution(int i,int j, int k) {
        int count = 0;
        String s = String.valueOf(k);
        for (int l = i; l <= j ;l++) {
            String val = String.valueOf(l);
            if (val.contains(s)){
                // 나누기 string 을 만듬 12 면 1 , 2
                String[] temp = val.split("");
                // 1 이랑 2 랑 비교 하고 같으면 ++
                for (String a : temp){
                    if(a.equals(s)) count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(solution(1,13,1));
    }
}
