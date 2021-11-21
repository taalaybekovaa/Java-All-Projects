package Homework7;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*Using Scanner ask user to provide any int number and print multiplication table of given number
     Input number: 5
     Output :
     5 * 1 = 5
     5 * 2 = 10
     5 * 3 = 15...*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Hi! Please provide any int number :");
        int number= scan.nextInt();
        System.out.println("Thank you.Input number :"+number+" Here is a multiplication table for your number.Enjoy!");

        for( int multiplication=1;multiplication<=10;multiplication++ ){
            int sum=number*multiplication;
            System.out.println(number+"*"+multiplication+"="+sum);
        }
    }
}
