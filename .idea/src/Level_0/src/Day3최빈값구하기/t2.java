package Day3최빈값구하기;

import java.util.HashMap;

public class t2 {

    public static void main(String[] args) {
         int []array = {1,1,1,2,2,2};
         //
        int answer=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int counter=0;
        int maxnum=-1;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
               if(array[i]==array[j]){
                   counter++;
               }
            }
            if(maxnum < counter){
                maxnum = counter;
            }
            map.put(array[i],counter);
            counter=0;
        }
        for (int i = 0;i<array.length;i++){
            System.out.print(map.get(i)+" ,");
        }
        System.out.println("\n"+maxnum);
        /////  여러게인지
        int max_count=0;
        for (int i = 0;i<array.length;i++){
            if(map.get(i) != null){
            int a =map.get(i);
            if(maxnum == a){
                max_count++;
            }
//                if(max_count>1){
//                    answer = -1;
                    break;
                }
            }
        System.out.println(max_count);
        System.out.println(answer);
        }
        }
