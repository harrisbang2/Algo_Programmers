package 푸드파이트;

class Solution {
    public String solution(int[] food) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            stringBuilder.append(String.valueOf(i).repeat(food[i] / 2));
        }

        return stringBuilder.toString() + "0" + stringBuilder.reverse().toString();
    }
}