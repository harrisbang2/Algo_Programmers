package 덧칠하기;

//class Solution {
//    public static int solution(int n, int m, int[] section) {
//        int answer = 0;
//        int index = 0;
//        int [] wall = new int[n];
//        for (int i = 0; i <n; i++) {
//                wall[i]=1;
//                if (index< section.length)
//                if(section[index]==i){
//                    wall[i]=0;
//                    index++;
//                }
//            }
//        for (int j = 0; j < n; j++) {
//            if(wall[j]==0){
//                try{
//                    answer++;
//                    for (int k=j; k < m+j; k++) {
//                        wall[k]=1;
//                    }
//                }catch (Exception e){
//                    return answer;
//                }
//                System.out.println("needs to be painted");
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(4,1,	new int[] {1, 2, 3, 4}));
//    }
//}
class Solution {
    public int solution(int n, int m, int[] section)
    {
    int answer = 0;
    int start = section[0];
    answer++;
    for (int item : section) {
        if (start + m > item) {
            continue;
        }
        start = item;
        answer++;
    }
    return answer;
}
}
