package Homework8;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        /* Write a Java program to check whether a given number is an armstrong number or not.
     Test Data :Input a number: 153
     Expected Output :153 is an Armstrong number.
     NOTE:
     An Armstrong number, also known as narcissistic number, is a number that is equal to the sum of the cubes of its own digits. For
     example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 +0*0*0 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number: ");

        int number = scan.nextInt();
        int sum=0;
        int armstrong = number;
        int firstDigit;

        for( ;number>0; ){
            firstDigit=number%10;//3
         sum=sum+(firstDigit*firstDigit*firstDigit);//27//
            number=number/10;//5
        }
        if(armstrong==sum){//Armstrong number n*n*n==to num-s sum
            System.out.println("Your number is an armstrong number");
        }else{
            System.out.println("Your number is not a armstrong number");
        }
    }
}
