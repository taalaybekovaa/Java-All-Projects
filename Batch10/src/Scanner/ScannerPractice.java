package Scanner;

import java.util.Scanner;

public class ScannerPractice {


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);// This is the scanner object

        String firstName="Fluffy";
        String lastName="Brown";

        System.out.println(lastName);//whatever ythe code below ou write it will show up with
        System.out.println("Please enter some string");
        String random= input.nextLine();
        System.out.println(random);

        String middleName;
        System.out.println("Please enter your middle name");//inform the user
        middleName= input.nextLine();
        System.out.println(firstName+middleName+lastName);



    }
}
