package Mentoring;

import java.util.Scanner;

public class GetTheDigitAndSum {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number= scanner.nextInt();
        int sumOfTheDigits=0;
        int sumOfMultiplication;

        while(number!=0){
            int digit =number%10;
            sumOfTheDigits+=digit;
            //sumOfMultiplication*=digit;
            number/=10;
        }
        //System.out.println(sum);
    }

}
