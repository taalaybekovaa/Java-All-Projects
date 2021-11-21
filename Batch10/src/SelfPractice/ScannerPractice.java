package SelfPractice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main (String [] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number of Fahrenheit to convert it to Celsius");
        double fahrenheit= input.nextDouble();
        System.out.println("You entered" +fahrenheit+" Fahrenheit");
        double celsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit+" converted to Celsius is "+celsius);
        



    }


}
