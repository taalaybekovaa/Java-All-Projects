package Homework6;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        /*Write a Java program that takes a year from user and print
         whether that year is a leap year or not.
         Input the year: 2016
         Output :2016 is a leap year*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year as an integer number : ");
        int year = scan.nextInt();

        if (year % 4 == 0 && year%100!=0 || year%400==0)
            System.out.println("Yay!"+year+" is a leap year");
        else {
            System.out.println("Oops!"+year+" is not a leap year");
        }
    }
}
