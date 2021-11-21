package Scanner;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int myDigit=327695;
        int maxLength=6;
        int minLength=6;
        System.out.println("Please enter 6 digits: ");
        String yourDigits= input.nextLine();
        boolean digitsPass=myDigit==maxLength && myDigit==minLength;
        System.out.println(yourDigits);

        System.out.println("You entered less or more than 6 digits. Please enter 6 digits");
        System.out.println(digitsPass);

        int digits= input.nextInt();
        System.out.println("Your digits is "+digits);
        int number = 327695;
        int firsDigit = number%10;
        System.out.println(firsDigit);// 5

        number = number/10;
        System.out.println(number);//32769

        int Digit2 = number%10;
        System.out.println(Digit2);// 9;

        number=number/10;// 3276
        int Digit3 = number%10;
        System.out.println(Digit3);// 6;

        number = number/10;//327
        int Digit4 = number%10;
        System.out.println(Digit4);// 7;

        number = number/10;// 32;
        int Digit5 = number%10;
        System.out.println(Digit5);// 2;

        number = number/10;// 3;
        int Digit6 = number%10;
        System.out.println(Digit6);// 3;

        int multiplication = firsDigit*Digit2*Digit3*Digit4*Digit5*Digit6;
        System.out.println("Multiplication of all digit is "+ multiplication);
        int sum = firsDigit+Digit2+Digit3+Digit4+Digit5+Digit6;
        System.out.println("Sum of all digits is "+sum);



    }
}