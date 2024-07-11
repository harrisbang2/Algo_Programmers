package 혼자서하는틱택토;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int solution(String[] board) {
        boolean O_won = false;
        boolean X_won = false;

        long x_count = 0;
        long O_count = 0;

        List<String> list = new ArrayList<>();
        for(String s : board){
            String []temp = s.split("");
            for (String i : temp){
                if(i.equals("X")){
                    x_count ++;
                }
                if (i.equals("O")){
                    O_count++;
                }
                list.add(i);
            }
        }
        // basic check.
        if (O_count < x_count){
            return 0;
        }
        if (O_count > x_count+1){
            return 0;
        }
        //check if the game is over
        O_won = Owon(list);
        X_won = Xwon(list);
        //
        if(O_won && O_count<=x_count){
            return 0;
        }
        if(X_won && x_count != O_count){
            return 0;
        }
        System.out.println(O_won);
        System.out.println(X_won);
        System.out.println(O_count +" : " +x_count);
        //--------------------------------------//
        return 1;
    }

    private static boolean Xwon(List<String> list) {
        ArrayList<Integer> integerlist = new ArrayList<>();
        if(!list.contains("X")){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("X")){
                integerlist.add(i);
            }
        }
        return checkwon(integerlist);
    }
    private static boolean Owon(List<String> list) {
        ArrayList<Integer> integerlist = new ArrayList<>();
        if(!list.contains("O")){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("O")){
                integerlist.add(i);
            }
        }
        return checkwon(integerlist);
    }
    private static boolean checkwon(ArrayList<Integer> integerlist) {

        if(integerlist.contains(0)&&integerlist.contains(1)&&integerlist.contains(2)){
            return true;
        }
        if(integerlist.contains(3)&&integerlist.contains(4)&&integerlist.contains(5)){
            return true;
        }
        if(integerlist.contains(6)&&integerlist.contains(7)&&integerlist.contains(8)){
            return true;
        }
        if(integerlist.contains(0)&&integerlist.contains(3)&&integerlist.contains(6)){
            return true;
        }
        if(integerlist.contains(1)&&integerlist.contains(4)&&integerlist.contains(7)){
            return true;
        }
        if(integerlist.contains(2)&&integerlist.contains(5)&&integerlist.contains(8)){
            return true;
        }
        if(integerlist.contains(0)&&integerlist.contains(4)&&integerlist.contains(8)){
            return true;
        }
        return integerlist.contains(2) && integerlist.contains(4) && integerlist.contains(6);
    }

//    public static void main(String[] args) {
//        String []board ={"OO.","XXX","OO."};
//        System.out.println(solution(board));
//    }
}
