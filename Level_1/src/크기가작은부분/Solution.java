package 크기가작은부분;

class Solution {
//    public static int solution(String t, String p) {
//        int answer = 0;
//        String []split = t.split("");
//        int length = p.length();
//        String a = "";
//        for (int i = 0; i < t.length(); i++) {
//            a+=split[i];
//            //마지막거 확인할때 자리수가 모자르면 앞에거 땡겨 씀
//            if(i == p.length()-1){
//                System.out.println(p.length()-a.length());
//                i -= p.length()-a.length();
//            }
//            //
//            if((i+1)%p.length()==0){
//                System.out.println(a);
//                if(parseInt(a)<=parseInt(p)){
//                    answer++;
//                }
//                a = "";
//            }
//        }
//        if(!a.equals("")){
//            if(parseInt(a)<=parseInt(p)){
//                answer++;
//            }
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        solution("3141592","271");
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pLong = Long.parseLong(p);
        for (int i = 0; i < t.length()-pLength + 1; i++){
            String tSubstring = t.substring(i, i + pLength);

            if (Long.parseLong(tSubstring) <= pLong) {
                answer++;
            }
        }
        return answer;
    }
}
