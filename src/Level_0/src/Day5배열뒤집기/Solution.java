package Day5배열뒤집기;

public class Solution {
    public static int[] solution(int[] num_list) {
        int a = num_list.length;
        int []answer = new int[a];
        int count = 0;
        for(int i = num_list.length-1;i>=0;i--){
            answer[count] = num_list[i];
            count++;
        }
        return answer;
    }
//
    public static void main(String[] args) {
        int[] ss ={1,2,3,4,5,6};
        System.out.print("[ ");
        for(int i=0;i<ss.length;i++){
            System.out.print(solution(ss)[i]+" ,");
        }
        System.out.print(" ]");
    }
}
