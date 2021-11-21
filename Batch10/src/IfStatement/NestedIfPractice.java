package IfStatement;

import java.util.Scanner;

public class NestedIfPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your city name? ");
        String cityname = scan.nextLine();

        /*Algorithm how to use nested statements. Pseudocode:
        1.If you are planning to ask some data from user, use Scanner to get the data
        2.Give a condition using If, right away put () and {} so you won't forget this.
        3.Inside of parenthesis write a condition, then use {and inside of parenthesis write sout and inside ( your block of code,
         which will be executed if condition is true) }
        4. Write else right away if the 1 condition will be false, user will see the code below
        after first block of code and curly brackets write else and {}. Inside of {} write your code
         to be executed in case if if condition will be false .
         5. If there are more than 1 condition, continue to give condition using IF inside of first block of code
          than with the same way give else
         Tips:
         If first condition is true it will keep asking
         users next questions(next if) if it's not user won't see other questions and it's going to give user else related for the first condition

        */

        if (cityname.equalsIgnoreCase("chicago")) {
            System.out.println(" What is your school name?");
            String schoolName = scan.nextLine();

            if (schoolName.equalsIgnoreCase("techtorial")) {
                System.out.println(" You are lucky to be in Batch 10");
            } else {
                System.out.println(" Please come and with it us ");
            }
        } else {
            System.out.println(" Please come to Chicago");
        }
    }
}
        /* ask user for his/her city name
        if the city name is Chicago
        Ask user 'what is the school name
        if the school name is 'Techtorial'
        print --> you are luck to be in the B10
        if the school name is not 'techtorial'
        print-->please come and visit us

        if the city name is not Chicago
        print --> please come to Chicago

         */
/*Scanner scanner=new Scanner(System.in);
        System.out.println("What is your city name");
        String cityName= scanner.nextLine();

        if (cityName.equalsIgnoreCase("Chicago")) {
            System.out.println("What is your school name?");
            String schoolName = scanner.nextLine();
            if (schoolName.equalsIgnoreCase("Techtorial")) {
                System.out.println("You are one of the HEROS");
            } else {
                System.out.println("Please visit Techtorial");
            }
        }else {
            System.out.println("Please come to Chicago");

 */
