package Homework8;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /* Write a Java program to find the perfect numbers within a given number of range.
           Test Data :
           Input the starting range or number : 1
           Input the ending range of number : 50
           Expected Output :
           The Perfect numbers within the given range : 6 28
           NOTE: you need to use the nested loop.
           Perfect number, a positive integer that is equal to the sum of its proper divisors. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a starting number :");
        int starting=scan.nextInt();
        System.out.println("Please enter a ending number: ");
        int ending=scan.nextInt();
        System.out.println("Perfect numbers within a given number of range is :");

        for (int i=starting; i<=ending; i++)
        {
            int sum=0;
            for (int divider=1 ;divider<i; divider++)
            {
                if (i % divider==0)
                    sum=sum+divider;
            }
            if (i==sum)
                System.out.print(i + " ");
        }
    }
}



