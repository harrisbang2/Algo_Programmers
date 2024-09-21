package 다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalW = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> passQue = new LinkedList();
        Queue<Integer> passedQue = new LinkedList();
        int truck_weightstotal = truck_weights.length;
        for (int i = 0; i < bridge_length; i++) {
            queue.add(0);
        }
        for (int i = 0; i < truck_weightstotal; i++) {
            passQue.add(truck_weights[i]);
        }

        while(passedQue.size()!=truck_weightstotal){

            int exit = queue.poll();
            if (exit != 0){
                passedQue.add(exit);
                totalW -= exit;
            }
                if(!passQue.isEmpty()&&(totalW + passQue.peek()) <= weight){
                    totalW += passQue.peek();
                    queue.add(passQue.poll());
                }
                else queue.add(0);
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(100,100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }
}
