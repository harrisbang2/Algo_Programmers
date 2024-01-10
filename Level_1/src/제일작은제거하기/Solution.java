package 제일작은제거하기;

import java.util.LinkedList;

class Solution {
        public static int[] solution(int[] arr) {
            int[] ans;
            if (arr.length == 1) {
                return new int[]{-1};
            }
            //
            int lowest = arr[0];
            int count = arr.length;
            for (int i = 0; i < arr.length; i++) {
                if (lowest > arr[i]) {
                    lowest = arr[i];
                }
            }
            //
            for (int i = 0; i < arr.length; i++) {
                if (lowest == arr[i]) {
                    count--;
                }
            }
            //
            ans = new int[count];
            int z = 0;
            for (int i = 0; i < count+1; i++) {
                if (arr[i]!=lowest) {
                    ans[z] = arr[i];
                    z++;
                }
            }
            if(ans.length==0){
                return new int[]{-1};
            }
            return ans;
        }

//    public static int[] solution(int[] arr) {
//        if(arr.length <2) return new int[]{-1};
//        //
//        int[] answer = new int[arr.length-1];
//        int mem = 10;
//        //
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<mem){
//                mem = arr[i];
//            }
//        }
//        //
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==mem){
//                arr[i] = 999;
//            }
//        }
//        //
//        int a = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[a]!=999){
//                a++;
//                answer[i]=arr[a];
//            }
//            else {
//                a++;
//            }
//        }
//        return answer;
//    }

    public static void main(String[] args){
        int newint[]={1,2,3,5};
        int ans [] = solution(newint);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
