package Project4;

import java.io.OutputStream;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Hi!Please enter 3 ingredients on the same line: ");
                String ingredient = scan.nextLine();
                System.out.println("Please enter a number : ");
                int number = scan.nextInt();

                String firstIngredient = ingredient.substring(0, ingredient.indexOf(" "));
                System.out.println(ingredient);
                //To get the first word substring from 0 index to space.It will be our first ingredient

                String remainder = ingredient.substring(ingredient.indexOf(" ")).trim();
                System.out.println(remainder);
                //To get the remainder without the first ingredient.Substring from space to end

                String secondIngredient = remainder.substring(0, remainder.indexOf(" "));
                //second ingredient is starting from 0th index to the space. this is our second ingredient

                String thirdIngredient = remainder.substring(remainder.indexOf(" ")).trim();
                //we get the third ingredient substring from the space to the end

                //
                System.out.println(number + firstIngredient.substring(1) + " " + ++number + secondIngredient.substring(1) + " " + ++number + thirdIngredient.substring(1));
        }
}
