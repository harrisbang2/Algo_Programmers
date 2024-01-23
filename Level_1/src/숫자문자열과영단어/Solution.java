package 숫자문자열과영단어;

import static java.lang.Integer.parseInt;

class Solution {
    public static int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<arr.length;i++) {
            if(s.contains(arr[i])) {
                s = s.replace(arr[i], Integer.toString(i));
            }
        }
        int answer = parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234four2311"));
    }
}
