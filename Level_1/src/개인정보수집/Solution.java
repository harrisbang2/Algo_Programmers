package 개인정보수집;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // 오늘 날짜를 계산하여 변수에 저장
        int checkDate = getDate(today);

        // 날짜를 계산하기 위해 약관 종류와 기간을 맵에 저장
        for (String s : terms) {
            String[] term = s.split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }

        // 개인정보 배열 privacies를 순회하며 처리 완료된 개인정보의 인덱스를 찾아서 리스트에 추가
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            // 처리 완료일 계산(개인정보 처리 시작일 + 처리 기간 * 28일)
            if (getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= checkDate) {
                answer.add(i + 1);
            }
        }

        // 리스트를 배열로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }

    // 날짜를 입력받아 계산하여 정수값으로 반환하는 메서드
    public static int getDate(String date) {
        String[] arr = date.split("\\.");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        // 날짜를 연도 * 12 * 28 + 월 * 28 + 일 로 계산하여 반환
        return (year * 12 * 28) + (month * 28) + day;
    }

//    static String globalToday;
//    public static List<Integer> solution(String today, String[] terms, String[] privacies) {
//        HashMap <String,Integer> termsProperties = new HashMap<>();
//        List<Integer> answer = new ArrayList<>();
//
//        // set today
//        globalToday = today;
//        // add terms
//        for(String s : terms) {
//            String []split = s.split(" ");
//            termsProperties.put(split[0], Integer.valueOf(split[1]));
//        }
//        // chack privacies and terms
//        int num = 1;
//        for(String s : privacies) {
//            String []split = s.split(" ");
//            if(expired(split[0],termsProperties.get(split[1]))){
//                answer.add(num);
//            }
//            num++;
//        }
//        return answer;
//    }
//
//    private static boolean expired(String s, Integer i) {
//        String []today = globalToday.split("\\.");
//
//        // calculate date
//        String []split = s.split("\\.");
//
//        if(Integer.parseInt(split[2]) > 28){
//            split[1] = String.valueOf(Integer.parseInt(split[1]) + 1);
//        }
//        //year calculation
//        if((Integer.parseInt(split[1]) + i)>12){
//            split[0] = String.valueOf(Integer.parseInt(split[0]) + 1);
//            split[1] = String.valueOf(Integer.parseInt(split[1])+i - 12);
//        }
//        else {
//            split[1] = String.valueOf(Integer.parseInt(split[1])+i);
//        }
//
//        // compare date
//        boolean yearislower = Integer.parseInt(today[0]) < Integer.parseInt(split[0]);
//        boolean yearissame = Integer.parseInt(today[0]) == Integer.parseInt(split[0]);
//        boolean monthislower = Integer.parseInt(today[1]) < Integer.parseInt(split[1]);
//        boolean monthissame = Integer.parseInt(today[1]) == Integer.parseInt(split[1]);
//        boolean dayislower = Integer.parseInt(today[2]) < Integer.parseInt(split[2]);
//        if(yearislower){
//            return false;
//        }
//        if(yearissame && monthislower){
//            return false;
//        }
//        if(yearissame && monthissame && dayislower){
//            return false;
//        }
//        return true;
//    }

//    public static void main(String[] args) {
//
//        String today = "2022.05.19";
//        String[] terms ={"A 6", "B 12", "C 3"};
//        String[] privacies ={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
//
//        for (int i : solution(today,terms,privacies)) {
//            System.out.println(i);
//        }
//    }
}
