package Loops;

public class DoWhilePractice {
    public static void main(String[] args) {
        int number = 10;

        /*while (number <= 0) {
            System.out.println(number);
            number--;// In case of false it's not going to show you anything */

           // number=10;
          //  do {
           // System.out.println(number);
          //  number--; //we need to update condition to make condition false
      //  }while(number>=0); //Here in case of false we are going to see at least one result. When you want print at least once
        //find the sum of numbers from 10 to 15 and print the result as "The total is..."


        int total=0;
        int number1=10;
        do {
            total=total+number1;
            number1++;
            System.out.println(number);

        } while (number1<=15);
        System.out.println(" The sum of number : "+ total);





        }
    }

