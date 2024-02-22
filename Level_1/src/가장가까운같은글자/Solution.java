package 가장가까운같은글자;

class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        //
        answer[0]=-1;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    answer[i] = i-j;
                }
                if(answer[i] == 0) {
                    answer[i] = -1;
                }
            }
        }
        //
        return answer;
    }

    public static void main(String[] args) {
        int a[] =solution("banana");
        for (int as : a){
            System.out.println(as);
        }
    }
}