package 두원사이의정수쌍;

class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

        long r1x = (long)Math.pow(r1,2);
        long r2x = (long)Math.pow(r2,2);

        long side = 0;

        for(long i=0;i<=r2;i++){

            long y2 = (long)Math.sqrt(r2x-(long)Math.pow(i,2));

            long y1 = (long)Math.sqrt(r1x-(long)Math.pow(i,2));

            if(Math.sqrt((r1x-Math.pow(i,2)))%1==0){
                side++;
            }
            answer+=(y2-y1)*4;
        }
        answer+=side*4-4;

        return answer;
    }
    //
    public static int solution2(int r1, int r2) {
        int answer = 0;

        for (int i = 1; i <= r2; i++) {
            int s;
            if (i < r1) {
                s = (int) Math.ceil(Math.sqrt((r1 * r1) - (i * i)));
            } else {
                s = 0;
            }

            int e = (int) Math.sqrt((r2 * r2) - (i * i));
            answer += e - s + 1;
        }

        return answer * 4;
    }
}
