package Ternary;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
    /* Ask user for their ;last name
    if the last name starts with A to K
    concat the last name with most popular last name
    otherwise concat the last name with : Well known last name
    print oput the result
     */
        Scanner scan=new Scanner(System.in);
        System.out.println(" Please enter your last name ");
        String lastname= scan.nextLine();

        String print=(lastname.charAt(0)>=65 && lastname.charAt(0)<=75) ?  lastname+"Most popular last name":lastname+"Well known last name";
        System.out.println(lastname + print);

    }
}

        /*
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your last name ");
        String lastName= input.nextLine().toUpperCase();

       String print= lastName.charAt(0)>='A' && lastName.charAt(0)<='K' ? lastName+"  most popular last name" : lastName+ "well known last name";

        System.out.println(print);
       char print1=lastName.charAt(0) >= 'A' && lastName.charAt(0) <='K' ? lastName.charAt(0): lastName.charAt(0);
        System.out.println(print1);

}
    }
}
*/