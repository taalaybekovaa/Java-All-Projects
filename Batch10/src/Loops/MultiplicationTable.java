package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 1;

        for (int multiplication = 1; multiplication <= 10; multiplication++) {

            int sum = number * multiplication;
            System.out.println(number + "*" + multiplication + "=" + sum);
            int i = 1;


            for (int num1 = 1; num1 < 10; num1++) {
                for (int num2 = 1; num2 <= 10; num2++) {
                    System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
                }
            }
//perfect number: a number is equals to its dividers sum
            //6 >> 1, 2, 3>> 1+2+3=6 6=6 is a perfect number

            int perfect$ = 28;
            int summ = 0;

            for (int divisor = 1; divisor < perfect$; divisor++){
                if (perfect$ % divisor == 0) {
                    summ = summ + divisor;
                }
        }
        System.out.println("The sum is>> "+summ);
            if (perfect$==summ){
                System.out.println("The number is a "+perfect$+"is a perfect number");
            }else{
                System.out.println("The number " +perfect$+"is not a perfect number");
            }

            }

            }

        }


