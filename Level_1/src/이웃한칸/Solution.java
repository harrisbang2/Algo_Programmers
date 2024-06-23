package 이웃한칸;

public class Solution {
    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        if(h > 0){
            if(board[h-1][w].equals(color)){
                answer++;
            }
        }
        if(w > 0){
            if(board[h][w-1].equals(color)){
                answer++;
            }
        }
        if(h+1 < board.length){
            if(board[h+1][w].equals(color)){
                answer++;
            }
        }
        if(w+1 < board[0].length){
            if(board[h][w+1].equals(color)){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[][] board ={{"파란색", "빨간색", "주황색", "빨간색"},{"빨간색", "빨간색", "파란색", "주황색"},{"파란색", "주황색", "빨간색", "빨간색"},{"주황색", "주황색", "빨간색", "파란색"}};
        int h = 1;
        int w = 1;
        System.out.println(solution(board,h,w));
    }
}
