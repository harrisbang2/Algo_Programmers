package test1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] answer = {};
        int numer1 = 3;
        int denom1 = 3;
        int numer2 = 3;
        int denom2 = 3;
        int max_denominator = denom1*denom2;
        float temp = (((float) numer1 /denom1)+((float) numer2 /denom2))*100;
        int numberof100 =0;
        System.out.println(temp);
        System.out.println(max_denominator);
        int min_denominator = 0;
        float Numerator = 0;
        //numberator calculator
        for(int i = 0;i<100;i++){
            if(temp <100){
                numberof100= i; //counting
                temp/=100;
                System.out.println(numberof100 +" : "+ temp);
                break;
            }
            else{
                temp -= 100;
            }
        }
        Numerator = (numberof100*min_denominator)+(temp*min_denominator);
        //min_denominator calculator
        for (int i=max_denominator-1; i>=1;i--){
            System.out.println(i);
            if(i==1){
                min_denominator=max_denominator;
                break;
            }
            if((max_denominator%i)==0){
                if((temp*i)%1==0){
                min_denominator = i;
                break;
            }
            }
        }
        Numerator = (numberof100*min_denominator)+(temp*min_denominator);
        answer = new int[]{(int)Numerator,min_denominator};
        System.out.println(answer[0]);
        System.out.println(answer[1]);


    }
}
