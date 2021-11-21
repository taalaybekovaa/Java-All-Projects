package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeTask {

    public static void main(String[] args) {

        /* ask user to provide their height and weight
        and calculate their BMI Formula BMI=Weight/(height*Height)
        */

        Scanner input= new Scanner(System.in);


        System.out.println("Please enter your weight ");
        double weight=input.nextDouble();

        System.out.println("Please enter your height ");
        double height= input.nextDouble();

        double BMI=(int)(weight/(height*height));
        System.out.println("Your BMI " +BMI);


    }
}
