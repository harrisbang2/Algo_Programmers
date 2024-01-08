package Day7양꼬치;

public class Solution {
    public static int solution(int n, int k) {
        int answer = 0;
        int free_drink = n/10;
        System.out.println(free_drink);
        return (n*12000)+(k-free_drink)*2000;
    }

    public static void main(String[] args) {
        System.out.println(solution(64,6));
    }
}
