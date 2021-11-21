package Ternary;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        /*
    Task: solve following question by using ternary operator
       At the electronics shop there are two different brands of TV options for customers
        1 - Samsung TVs
        2 - Other TVs
       Ask customer: 'Which brand are you interested in?"
       based on their response:
       if they said Samsung: Print --> "Samsung TV prices are starting from $1199"
                      otherwise : Print --> "Other TV prices are starting from $599"
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Which brand are you interested in? Samsung/ others");
        String response= input.nextLine();

        // condition ? option : option2

       String print= response.equalsIgnoreCase("Samsung")  ? "Samsung Tv prices are starting from $1199" : "Other TV prices are starting from $599";
       // Create a storage for result   After ? we are going to see the options depending on true and false

        System.out.println(print);

    }
}


  /* Scanner scan=new Scanner(System.in);
        System.out.println(" Which brands are you interested in? Samsung/ Other TV ");
           String brand= scan.nextLine();
           String samsung="Samsung TV prices are starting from $1199";
           String otherTV="Other TV prices are starting from $599";

           String compare=brand.equalsIgnoreCase("Samsung") ? samsung:otherTV;
        System.out.println(compare);*/
