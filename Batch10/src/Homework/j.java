package Homework;

import java.util.Scanner;

public class j {
    /* Using a scanner enter three different ingredients for the product on the same line.
     Then ask the user to enter any int number. Change the first letter of the ingredients starting from the entered number.
     (Ingredients should start with different letters. Please read the example carefully ) Example 1:
     Please enter three ingredients with spaces:
     Milk Peanuts Butter
     Expected output is:
     5ilk 6eanuts 7utter*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi!Please enter 3 ingredients on the same line: ");
        String ingredient = scan.nextLine();
        System.out.println("Please enter a number : ");
        int number = scan.nextInt();

        String ingredient1 = ingredient.substring(0, ingredient.indexOf(" "));
        /*To get the first word substring from 0 index to the space.It's our first ingredient*/

        String remainder = ingredient.substring(ingredient.indexOf(" ")).trim();

        /*To get the remainder without the first ingredient.Substring from space to end*/

        String ingredient2 = remainder.substring(0, remainder.indexOf(" "));
        /*Second ingredient is starting from 0 index to the space.It's our second ingredient*/

        String ingredient3 = remainder.substring(remainder.indexOf(" ")).trim();
        /*We got third ingredient using substring from the space to the end*/

        System.out.println(number + ingredient1.substring(1) + " " + ++number + ingredient2.substring(1) + " " + ++number + ingredient3.substring(1));
        /* we removed 1st letter of the word using substring from 0 up to 1*/
    }
}


