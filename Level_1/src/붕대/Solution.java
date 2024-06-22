package 붕대;

class Solution {

    /*
    *
    * bandage [ 시전 시간 , 초당 회복, 연속 회복시 보너스]
    * health : 체력
    * attacks [공격 시간][ 피해량 ]
    */

    public static int solution(int[] bandage, int health, int[][] attacks) {
        // Initial variables
        int last_time = attacks[attacks.length-1][0];
        int now_h = health; // 현재 체력
        int a_idx = 0; // 공격한 횟수
        int h_idx = 0; // 회복한 횟수
        int si_time = bandage[0]; // 시전 시간
        int healing = bandage[1]; // 초당 회복량
        int b_healing = bandage[2]; // 추가 회복량

        // looping until last attack
        for (int i = 0; i <= last_time; i++) {
            // checking each turn attack
            if(attacks[a_idx][0]==i){
                // reducing health
                now_h -= attacks[a_idx][1];
                a_idx++; // attack index ++
                h_idx = 0; // continuous healing stops
                //
                if (now_h <= 0){
                    // if the health is 0 , character is dead , exit instant
                    return -1;
                }
            }
            // not being attacked
            else {
                // confirming that the health is not full on max health
                if(now_h < health){
                    h_idx++;
                    now_h += healing;
                    // checking if the healing was continuous and deserves bonus
                    if(h_idx == si_time){
                        now_h += b_healing;
                        h_idx=0;
                    }
                    // resetting if the healed health is bigger than max
                    if(now_h > health){
                        now_h = health;
                    }
                }
            }
        }
        return now_h;
    }

    public static void main(String[] args) {
        System.out.printf("" + solution(new int [] { 5 , 1 , 5 } , 30 , new int[][] { {2, 10}, {9, 15}, {10, 5} ,{11, 5} }));
    }
}
