package Day3최빈값구하기;

public class main {
    public static void main(String[] args) {
        int []array = {1,1,1,2,2,2,1};
        int answer = -1;
        int []f = new int[1000];
        int max = 0;
        for(int i = 0 ; i < array.length;i++){
            f[array[i]]++;
            if(max<f[array[i]]){
                max = f[array[i]];
                answer = array[i];
            }
        }
        int max_count =0;
        for(int i = 0 ; i < array.length;i++){
            if(max==f[i]) max_count ++;
            if(max_count>1) answer = -1;
        }
    }
}
