package Day4피자나누어먹기123;

public class Pizza1 {
    public int solution(int n) {
        int answer = 0;
        int peice=0;
        boolean flag = true;
        while(flag){
            n = n-7;
            peice++;
            if(n <= 0){
                break;
            }
        }
        answer = peice;
        return answer;
    }
    public static void main(String[] args) {
        Pizza1 a = new Pizza1();
        System.out.println(a.solution(1));
    }
}
