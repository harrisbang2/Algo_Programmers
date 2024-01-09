package DayX배열회전시키기;

public class Solution {
    public static int[] solution(int[] numbers, String direction) {
        int max = numbers.length; //4
        int[] answer = new int[max]; // [3]
        //right rotation.
        if(direction.equals("right")){
            answer[0] = numbers[max-1];
            for (int i = 0; i < max-1; i++) {
                    answer[i+1]=numbers[i];
            }
        }
        //Left rotation.
        else if(direction.equals("left")){
            answer[max-1]=numbers[0];
            for (int i = 1; i < max; i++) {
                answer[i-1]=numbers[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int []a ={3,4,3,4,5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(solution(a,"right")[i]);
        }
    }
}
