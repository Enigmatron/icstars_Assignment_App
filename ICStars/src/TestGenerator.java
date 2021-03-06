import javafx.beans.binding.When;

import java.math.*;
import java.util.Random;


public class TestGenerator {

    static Random sign = new Random(84);
    static Random Value = new Random(42);



    public static class TestQuestion{
        int QNumber;
        String QQuestion;
        boolean QAnswer;
        private TestQuestion(int n, String q, boolean ans){
            QNumber=n;
            QQuestion = q;
            QAnswer=ans;
        }
        public static TestQuestion Generate(int previousQNumber, int scaleBetween, int floor, int ceil){

            boolean sign1 = sign.nextBoolean();
            boolean sign2 = sign.nextBoolean();
            boolean sign3 = sign.nextBoolean();
            boolean sign4 = sign.nextBoolean();
            boolean sign5 = sign.nextBoolean();

            int v1 = (int)(((ceil-floor)* sign.nextDouble()) + floor);
            int v2 = (int)(((ceil-floor)* sign.nextDouble()) + floor);
            int v3 = (int)(((ceil-floor)* sign.nextDouble()) + floor);
            int v4 = (int)(((ceil-floor)* sign.nextDouble()) + floor);

            String temp = "";
            String temp2 = "";


            boolean ans4 = true;
            boolean ans5 = true;
//            boolean ans1 = (ans4 || (sign2 && v1==v2));
//            boolean ans2 = (ans5 || (sign5 && v3==v4));
            boolean ans3;




//            When.BooleanConditionBuilder hi = new When.BooleanConditionBuilder().


//            int v1 = (int)(((ceil-floor)* sign.nextDouble()) + floor);
//            int v2 = (int)(((ceil-floor)* sign.nextDouble()) + floor);
//            int v3 = (int)(((ceil-floor)* sign.nextDouble()) + floor);
//            int v4 = (int)(((ceil-floor)* sign.nextDouble()) + floor);
            temp = temp.concat("is " + v1 + " ");

            if(sign1) {
                temp = temp.concat(">");
                ans4 = v1 > v2;
            }
            else{
                temp = temp.concat("<");
                ans4 = v1 < v2;
            }
            if(sign2) {
                temp = temp.concat("= ");
            }
            else{
                temp = temp.concat(" ");
            }
            temp = temp.concat("" + v2);



            temp2 = temp2.concat("" + v3 + " ");
            if(sign4) {
                temp2 = temp2.concat(">");
                ans5 = v3 > v4;
            }
            else{
                temp2 = temp2.concat("<");
                ans5 = v3 < v4;

            }
            if(sign5) {
                temp2 = temp2.concat("= ");
            }
            else{
                temp2 = temp2.concat(" ");
            }
            temp2 = temp2.concat("" + v4);

            boolean ans1 = (ans4 || (sign2 && v1==v2));
            boolean ans2 = (ans5 || (sign5 && v3==v4));


            if(sign3)
            {
                temp = temp.concat(" or ");
                ans3 = ans1 || ans2;
            }
            else
            {
                temp = temp.concat(" and ");
                ans3 = ans1 && ans2;

            }

            temp = temp.concat(temp2);
//            temp = temp.concat("" + v3 + " ");
//            if(sign4) {
//                temp = temp.concat(">");
//            }
//            else{
//                temp = temp.concat("<");
//            }
//            if(sign5) {
//                temp = temp.concat("= ");
//            }
//            else{
//                temp = temp.concat(" ");
//            }
//            temp = temp.concat("" + v4);


//            boolean answer = true;

            return new TestQuestion(++previousQNumber ,temp,ans3);
        }
    }


    public static void main(String[] args){
        TestQuestion t1 = TestQuestion.Generate(0,0,10,55);
        TestQuestion worstcase = TestQuestion.Generate(0,0,10,55);

//        int num = t1.QNumber;
//        String out = t1.QQuestion;
        System.out.println(t1.QNumber + ": "+t1.QQuestion + " is " + t1.QAnswer);
        for (int i  = 0; i<1000; i++){
            t1 = TestGenerator.TestQuestion.Generate(t1.QNumber,0,10,55);
            System.out.println(t1.QNumber + ": "+t1.QQuestion + " is " + t1.QAnswer);
        }
    }
}
