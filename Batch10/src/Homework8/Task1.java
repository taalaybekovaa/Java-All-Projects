package Homework8;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
        Test Data :
        Input the number of terms : 5
        Expected Output :1 + 11 + 111 + 1111 + 11111
        The Sum is : 12345*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int givenNumber = input.nextInt(), sum = 0, serialnumber = 1;//to create a serial number
                                  // basket for sum

        for (int i = 0; i < givenNumber; i++) {

            System.out.print(serialnumber + "+");
            sum = serialnumber + sum;
            serialnumber = (serialnumber * 10) + 1;//to do the serial number 10 times bigger+1 to get 11++...
            // we can also use a string, but than we'll need to create a second nested for loop to get the sum
        }
        System.out.println();
        System.out.println("The sum is: "+sum);
    }
}