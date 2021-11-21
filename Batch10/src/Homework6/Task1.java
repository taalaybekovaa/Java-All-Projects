package Homework6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

       /* Using scanner ask user to enter to String value and concatenate them
        together then print the result. If both String length is not same then omit
        chars from the longer string, so it is the same length as the shorter string.
                After making both string same length then concatenate it.
        EXAMPLE-1:
        String 1: "Cell"
        String 2: "Phone"
        Output: "CellPhon"
        EXAMPLE-2:
        String 1: "Cable"
        String 2: "Mic"
        Output: "CabMic"*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first String");
        String first = input.nextLine();
        System.out.println("Please enter second String");
        String second = input.nextLine();

        String answ = first.length() <= second.length() ? first : second;

        if (answ.equalsIgnoreCase(first)) {
            int lengthFirst = first.length();
            String minus = second.substring(0, lengthFirst);
            System.out.println(first.concat(minus));

        } else {
            int lengthSecond = second.length();
            String minus = first.substring(0, lengthSecond);
            System.out.println(minus.concat(second));
        }
    }
}
