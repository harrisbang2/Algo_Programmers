package 데이터분석;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class Solution {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> data_type = new HashMap<String, Integer>();
        data_type.put("code",0);
        data_type.put("date",1);
        data_type.put("maximum",2);
        data_type.put("remain",3);

        ArrayList<int []> filtered_data = new ArrayList<>();
        for (int [] d : data){
            if (d[data_type.get(ext)] < val_ext){
                filtered_data.add(d);
            }
        }
        filtered_data.sort(Comparator.comparingInt(arr -> arr[data_type.get(sort_by)]));

        return  filtered_data.toArray(new int[0][0]);
    }

    public static void main(String[] args) {

    }
}
