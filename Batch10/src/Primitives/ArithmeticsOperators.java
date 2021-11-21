package Primitives;

public class ArithmeticsOperators {

    public static void main (String []args){

        //arithmetic operators is are +, -, *, /, %(modulus)

        int a = 9;

        int b = a+5;

        int carCount=b*2;//If each person has 2 cars

        int finalCarCount= carCount-10;

        System.out.println(finalCarCount);

        int numberOfRows = finalCarCount/3;

        System.out.println("I need this ,many rows to park all the cars :"+numberOfRows);

        double division = a/2;
        System.out.println (division);

        int division1=a/2;
        System.out.println(division1);

        double division3 = a/2d;
        System.out.println(division3);
        //int division4 =a/2d;// this is will not compile, you can't store double reult into int data type

        float division5=a/2f;
        System.out.println(division5);









    }
}
