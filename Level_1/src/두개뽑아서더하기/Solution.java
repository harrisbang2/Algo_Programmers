package 두개뽑아서더하기;

import java.util.*;

class Solution {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        SortedSet <Integer>theSet = new TreeSet<>();
        for (int k = 0; k < numbers.length; k++){
            for (int i = 0; i < numbers.length; i++) {
                if(!(k==i)){
                    theSet.add(numbers[k]+numbers[i]);
                }
            }
        }

        return theSet.stream().mapToInt(Number::intValue).toArray();
    }

    public static void main(String[] args) {
        int test[] = solution(new int[]{2, 1, 3, 4, 1});

        for(int num : test){
            System.out.println(num);
        }
    }
}