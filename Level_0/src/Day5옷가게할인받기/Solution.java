package Day5옷가게할인받기;

class Solution {
    public int solution(int price) {
        float ratio = 0;
        if(price>=100000){
            ratio = 0.05f;
        }
        if(price>=300000){
            ratio = 0.1f;
        }
        if(price>=500000){
            ratio = 0.2f;
        }
        return (int)(price - (price*ratio));
    }
}
