package K번째수;

import java.util.Arrays;

class Solution {
//    public static int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length-1]; // 3
//        for (int i = 0; i < 3; i++) {
//            int[] temp= commands[i];
//            int[] temp2 = new int[temp[1]-temp[0]+1];
//            int index =0;
//            //
//
//            for (int j = temp[0]-1; j < temp[1]; j++) {
//                temp2[index] = array[j];
////              System.out.println("index : " +j +" : "+array[j]);
//                index++;
//            }
//
//            Arrays.sort(temp2);
//            //ans 에 넣기
//            answer[i]=temp2[temp[2]-1];
//        }
//        return answer;
//    }
// {1,5,2,6,3,7,4} / {{2,5,3},{4,4,1},{1,7,3}}
public static int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length]; // 3
    int n = 0;
    for (int i = 0; i < commands.length; i++) {
        int index = 0;
        int[] list = new int[commands[i][1] - commands[i][0] + 1];
        for (int j = commands[i][0]; j <= commands[i][1]; j++) {
            list[index++] = array[j - 1];
        }
        Arrays.sort(list);
        answer[i] = list[commands[i][2] - 1];
}
    return answer;
}
    public static void main(String[] args) {
        int [][] a = {{2,5,3},{4,4,1},{1, 7, 3}};
        int [] b ={1, 5, 2, 6, 3, 7, 4};
        System.out.println(solution(b,a)[0]);
        System.out.println(solution(b,a)[1]);
        System.out.println(solution(b,a)[2]);
    }
}
