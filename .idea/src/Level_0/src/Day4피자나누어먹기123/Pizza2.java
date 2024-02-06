package Day4피자나누어먹기123;

public class Pizza2 {
    public int solution(int n) {
        int answer = 0;
        int pizzanum =1;
        int pizza_per_peice = 6;
        int total_peice;
        boolean flag = true;
        while(flag){
            total_peice = pizza_per_peice*pizzanum;
            if((total_peice%n)==0){
                return pizzanum;
            }
            else {
                pizzanum++;
            }
        }
        return pizzanum;
    }

    public static void main(String[] args) {
Pizza2 a = new Pizza2();
        System.out.println(a.solution(4));
    }
}
