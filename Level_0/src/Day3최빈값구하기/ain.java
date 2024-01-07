package Day3최빈값구하기;

import java.util.Arrays;
import java.util.HashMap;

public class ain {
    public static void main(String[] args) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int []array = {3,2,1,5,6,7,9,8,3,2,1,1,1};
        int total = 0;
        int counter=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println(array[i]+" : "+array[j]);
                    counter++;
                    if(counter>total){
                        total = counter;
                        map.put(total,array[i]);
                        counter = 0;
                    }
                }
            }
            counter = 0;
            }
        answer = map.get(map.get(total));
        System.out.println(Arrays.toString(array));
        System.out.println(answer);
        }
        //return answer;
    }
