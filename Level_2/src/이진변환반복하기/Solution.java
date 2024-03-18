package 이진변환반복하기;

class Solution {
  public static int[] solution(String s) {
    int[] answer = new int[2];
    int count=0;
    int remove=0;

    while(!s.equals("1")){
      count++;
      int length_previous=s.length();
      //0제거
      s=s.replace("0","");
      int length=s.length();
      remove+=length_previous-length;
      if(s.equals("1")){
        break;
      }
      // s의 길이 를 2집번으로
      StringBuilder stringBuilder=new StringBuilder();
      while(length>=2){
        stringBuilder.append(String.valueOf(length%2));
        length=length/2;

        if(length<2){
          stringBuilder.append(String.valueOf(length));
          break;
        }
      }
      s = stringBuilder.reverse().toString();
      if(s.equals("1")){
        break;
      }
    }
    answer[0]=count;
    answer[1]=remove;
    return answer;
  }


  public static void main (String[]args){

    String input = "110010101001";
    int[] ans = solution(input);
    System.out.println(ans[0]);
    System.out.println(ans[1]);
  }
}
