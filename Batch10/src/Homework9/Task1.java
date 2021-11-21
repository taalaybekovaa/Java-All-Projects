package Homework9;

import java.util.Arrays;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
    /* Create the int array with given numbers 10,4,3,55,32,145,443,234,98,32.Using scanner user to provide any number from given array, then remove the value from array and put 0 instead of that.
    Example: Given Number: 234
    Output: 10, 4, 3, 55, 32, 145, 443, 0, 98, 32 */

        int[] givenNumbers = {10, 4, 3, 55, 32, 145, 443, 234, 98, 32};
        System.out.println(Arrays.toString(givenNumbers));
        System.out.println("Please choose which one you would like to remove from Array");
        Scanner scan = new Scanner(System.in);
        int usersInput = scan.nextInt();

        for (int i = 0; i < givenNumbers.length; i++) {
            if (usersInput == givenNumbers[i]) {
                givenNumbers[i]=0;
                break;       /*Optional:In case if user inputs 32 and I would like to remove all 32 in Array-
                               I can delete break-it will replace both duplicated numbers.Otherwise, it will delete
                               only first one */
            }
        }
        System.out.println(Arrays.toString(givenNumbers));
    }
}
