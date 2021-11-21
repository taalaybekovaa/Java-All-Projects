package Loops;

import java.util.Random;
import java.util.Scanner;

public class PracticePractice {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println(" Please enter a positive integer which is less than 10 ");
        int number= scan.nextInt();


        for (;number<=10; number++){

            System.out.println(number);
        }
    }
}
