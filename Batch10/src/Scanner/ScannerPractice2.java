package Scanner;

import java.util.Scanner;
public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);//This is creation of scanner object

        System.out.println("Please enter your name");//If you take out the ln-it will
        // be showing on the same line
        String name= input.nextLine();//Which means go and read the next line or input.next();
        // Because of this Java will vait your response

        System.out.println("Your name is "+name);// To be able to reas we need to inter the value

        System.out.println("Please enter your last name ");

        String lastName= input.nextLine();

        System.out.println("Your full name is "+name+" "+lastName);

        System.out.println("Please enter your age : ");

        int age=input.nextInt(); // now will accept only numbers

        System.out.println(" Your age will be "+(age+10)+" in 10 years");

        int ageinFiveYearsnFiveYears= age+5;
        System.out.println("Your age will be "+(ageinFiveYearsnFiveYears)+" after 5 years");


    }
}
