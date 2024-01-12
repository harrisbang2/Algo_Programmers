package 이상한문자만들기;


public class Solution {
    public static String solution(String s) {
        String answer = "";
        String[] split = s.split("");

        int index = 0;
        for(int i=0; i<split.length; i++) {
            if(split[i].equals(" ")) {
                index = 0;
            } else if(index % 2 == 0) {
                split[i] = split[i].toUpperCase();
                index++;
            } else if(index % 2 != 0) {
                split[i] = split[i].toLowerCase();
                index++;
            }
            answer += split[i];
        }
        return answer;
    }
//    public static String solution(String s) {
//        String answer = "";
//        String []splitwords = s.split(" ");
//        for (int i = 0; i < splitwords.length; i++) {
//            String[] alphabets = splitwords[i].split("");
//            if(splitwords[0].equals(" ")){
//            }
//            else {
//            for (int j = 0; j < alphabets.length; j++) {
//                if((j)%2==0){
//                    answer+= alphabets[j].toUpperCase();
//                }
//                else if((j)%2==1&&alphabets[j].charAt(0)<97) {
//                    answer+=alphabets[j].toLowerCase();
//                }
//                else {
//                    answer+=alphabets[j];
//                }
//            }
//            }
//            if(i<splitwords.length-1)
//                answer+= " ";
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        System.out.println(solution(" asdadasdas kimchi is food "));
    }
}
