package Project4;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your words ");
        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        String original1=input1, original2=input2, original3=input3;

        input1=input1.toLowerCase();
        input2=input2.toLowerCase();
        input3=input3.toLowerCase();

        if (input1.length() == input2.length() && (input1.length() == input3.length()
            && input1.contains("java") ==input2.contains("java") && input3.contains("java")
                && original1.charAt(0)<=90 && original1.charAt(0) >=65 && original2.charAt(0)<=90 && original2.charAt(0) >=65
                && original3.charAt(0)<=90 && original3.charAt(0)>=65)){
            System.out.println("Your answer is true");
        }
        else{
        System.out.println("false");
        }


        }
    }
