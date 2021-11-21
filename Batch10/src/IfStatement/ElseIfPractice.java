package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {

    public static void main(String[] args) {

        /*If the number falls in to range of 0 to 5; ---->Your number between 0-5;
        If the number falls in to range of 6 to 10; ----> Your number is between 6-10;
        If the number falls in to range of 11 to 15;----> Your number is between 11-15;
        If the number falls in to range of 16 to 20; ---->Your number is between 16-20;

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please pick a number between 0 and 20");
        int number=input.nextInt();

        if (number>=0  && number <=5) {
            System.out.println("Your number between 0-5");
        }else if (number>=6 && number <=10){
            System.out.println("Your number is between 6-10");
        }else if (number>=11 && number <=15){
            System.out.println("Your number is between 11-15");
        }else if (number >=16 && number <=20){

        }




    }
}
