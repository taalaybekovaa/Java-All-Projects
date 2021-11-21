package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*
        Ask user how many times they want to store
        get names from user to save
        store those names in an String array
        if the name has more than 5 letters; save it to an Array as longNAmes
        if the name has less than 5 letters save it to an array by using toString() method
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many times you want to store?");
        int size = scan.nextInt();

        String[] longNames = new String[size];
        String[] shortName = new String[size];

        for (int i = 0; i < size; size++) {
            System.out.println("Please enter a names : ");
            String names = scan.next();

            if (names.length() > 5) {
                longNames[i] = names;

            } else {
                shortName[i] = names;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortName));
    }
}

