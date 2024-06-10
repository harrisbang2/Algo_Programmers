package 가장많이받은선불;

import java.util.Collections;
import java.util.HashMap;

class Solution {
    public static int solution(String[] friends, String[] gifts) {
        HashMap<String,HashMap<String,Integer>> gift_table = new HashMap<>(); // 전체 선물 기록
        HashMap<String,Integer> giftScore = new HashMap<>(); // 선물 점수 기록.
        HashMap<String,Integer> nextMonth = new HashMap<>(); // 최종 결과.
        /*
         * 친구들 등록하기
         */
        for(String s : friends){
            gift_table.put(s,new HashMap<>());
            giftScore.put(s,0);
            nextMonth.put(s,0);
        }
        /*
         * 친구들 선물기록 측정
         */
        for (String s : gifts){
            String[] spilt = s.split(" ");
            String sender = spilt[0];  // 보내는 사람
            String receiver = spilt[1]; // 받는 사람

            //
            gift_table.get(sender).put(receiver, gift_table.get(sender).getOrDefault(receiver, 0) + 1);
            giftScore.put(sender,giftScore.get(sender) + 1);
            giftScore.put(receiver,giftScore.get(receiver) - 1);
        }
        /*
         * 계산
         */
        for (String sender : friends){
            for (String receiver : friends){
                // friends 전부를 하는거기때문에 동일 보낸이 받은이 로 계산이 섞일수 있음.
                if(!sender.equals(receiver)){
                    int giftsFromGiver = gift_table.get(sender).getOrDefault(receiver, 0);
                    int giftsFromReceiver = gift_table.get(receiver).getOrDefault(sender, 0);

                    // 보낸 선물이 더 많을 경우 +1
                    if (giftsFromGiver > giftsFromReceiver) {
                        nextMonth.put(sender, nextMonth.get(sender) + 1);
                    }
                    // 보낸/받은 선물이 더 같을 경우 경우 +1
                    else if (giftsFromGiver == giftsFromReceiver && giftScore.get(sender) > giftScore.get(receiver)) {
                        nextMonth.put(sender, nextMonth.get(sender) + 1);
                    }
                }
            }
        }

        /*
         * 가장 많이 선물 선물 지수 측정 후 반환.
         */
        return Collections.max(nextMonth.values());
    }
//    public static void main(String[] args) {
//        String[] friends,gifts;
//        friends = new String[]{"muzi", "ryan", "frodo", "neo"};
//        gifts = new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
//        System.out.println(solution(friends,gifts));
//    }
}
