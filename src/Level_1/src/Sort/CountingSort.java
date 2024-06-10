package Sort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] sub = {7,3,1,3,-4,2};

        int min = Arrays.stream(sub).min().orElse(0);
        int max = Arrays.stream(sub).max().orElse(Integer.MAX_VALUE);

        int []countingArr= new int [max-min+1];
        for (int i : sub){
            countingArr[i - min]++;
        }

        //
        int arrayIndex = 0;
        for (int i = max-min; i >=0; i--) { // decending?
            while (countingArr[i]>0){
                sub[arrayIndex] = i+min;
                countingArr[i]--;
                arrayIndex++;
            }
        }
        for(int i : sub){
            System.out.println(i);
        }
    }
}
