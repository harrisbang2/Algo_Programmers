package 모의고사;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] answers) {
        int [] stu1 = {1,2,3,4,5};
        int [] stu2={ 2, 1, 2, 3, 2, 4, 2, 5};
        int [] stu3={ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int stu1score =0;
        int stu2score =0;
        int stu3score =0;
        int[] answer = {};
        //
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == stu1[i%5]) stu1score++ ;
            if(answers[i] == stu2[i%8]) stu2score++ ;
            if(answers[i] == stu3[i%10]) stu3score++ ;
        }
        int highscore = Math.max(stu1score,Math.max(stu2score,stu3score));
        List<Integer> ls = new ArrayList<>();
        if(stu1score == highscore){
            ls.add(1);
        }
        if(stu2score == highscore){
            ls.add(2);
        }
        if(stu3score == highscore){
            ls.add(3);
        }
        return ls;
    }
}