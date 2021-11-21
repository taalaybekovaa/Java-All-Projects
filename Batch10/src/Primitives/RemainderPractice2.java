package Primitives;

import java.sql.SQLOutput;

public class RemainderPractice2 {

    public static void main (String[] args){

        int number=-2223;//multiply
        int firstDigit=number%10;//this is first digit -->

        number=number/10; //thi is my new number -->143
        System.out.println("First digit or first remainder"+ firstDigit);

        int secondDigit=number%10;
        number=number/10;
        System.out.println(secondDigit);

        int thirdDigit=number%10;
        number=number/10;
        System.out.println(thirdDigit);

        int forthDigit=number%10;
        number=number/10;


        int productResult=(firstDigit*secondDigit*thirdDigit*forthDigit);

        System.out.println(productResult);

        int d=9/2;
        System.out.println(d);




    }

}

