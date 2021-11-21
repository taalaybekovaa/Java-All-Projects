package Project4;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        /* Using a scanner enter three different ingredients for the product on the same line. Then ask the user to enter any int number. Change the first letter of the ingredients starting
from the entered number. (Ingredients should start with different letters. Please read the example carefully ) Example 1:
Please enter three ingredients with spaces:
Milk Peanuts Butter
Please enter the int number:
5
The output is:
5ilk 6eanuts 7utter
Example 2:
Please enter three ingredients with spaces:
Sugar Cocoa Oil
Please enter the int number:
3
The output is:
3ugar 4ocoa 5il
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hi!Please enter 3 different ingredients on the same line ");
        String ingredient1= scanner.next(); String ingredient2=scanner.next(); String ingredient3=scanner.next();

        Scanner inputInt=new Scanner(System.in);
        System.out.println("Please enter any int number :");
        int number=inputInt.nextInt();

       ingredient1= ingredient1.substring(1); ingredient2=ingredient2.substring(1); ingredient3=ingredient3.substring(1);
        System.out.println(number+ingredient1+" "+(++number+ingredient2)+" "+(++number+ingredient3));




    }
}
