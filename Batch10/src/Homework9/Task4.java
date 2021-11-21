package Homework9;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

/*  Write the application to find the second-largest value from given array.
Example:
Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
Output: 8 */

        int[] numbers = {3,2,8,9,1,5,4,3,7,8,5,9,9};
        int big = numbers[0];
        int secondLargest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > big) {
                secondLargest=big;
                big = numbers[i];
            }
            if (numbers[i] < big && numbers[i] > secondLargest){
                secondLargest=numbers[i];
            }
            System.out.println(big);// it will give you the updates for every iteration
        }
        System.out.println(big);
        System.out.println(secondLargest);
    }
}