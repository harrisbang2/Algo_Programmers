package Day4배열의평균값;

public class ArrayAverage {
    public double solution(int[] numbers) {
        double answer = 0;
        int temp=0;
        for(int i = 0; i<numbers.length;i++){
            temp += numbers[i];
        }
        answer= (double) temp /numbers.length;
        return answer;
    }
    public static void main(String[] args) {
        ArrayAverage a = new ArrayAverage();
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(a.solution(s));
    }
}
