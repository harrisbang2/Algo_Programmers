package Day4피자나누어먹기123;

public class Pizza3 {
    public int solution(int slice, int n) {
        int pizzanum =1;
        int pizza_per_peice = slice;
        int total_peice;
        boolean flag = true;
        while(flag){
            total_peice = pizza_per_peice * pizzanum;
            if((total_peice%n)==0||(total_peice>=n)){
                return pizzanum;
            }
            else {
                pizzanum++;
            }
        }
        return pizzanum;
    }

    public static void main(String[] args) {
        Pizza3 a = new Pizza3();
        System.out.println(a.solution(7,10));
    }
}
