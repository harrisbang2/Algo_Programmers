package Day3중앙값구하기;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]<array[j]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        int halfsize = array.length/2;
        answer = array[halfsize];
        return answer;
    }
}
