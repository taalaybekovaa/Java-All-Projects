package Array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
/*Find the biggest number from this array
Create an array to store these numbers: 45, 5, 6, 47, 57, 8, 12, 0, 30
* Create an array to st*/

        int[] numbers = {45, 5, 6, 47, 57, 8, 12, 0, 30};
        int biggestNumbers = numbers[0];
        //int smallestNumbers=numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestNumbers) {
                biggestNumbers = numbers[i];

            }
            System.out.println(biggestNumbers);
        }
        System.out.println(biggestNumbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length - 1]);//This is first element and also smallest number since the array is sorted

        // write a code to find smallest number with out using sort method

        int[] numbers1 = {45, 5, 6, 47, 57, 8, 12, 0, 30, -25};
        int smallestNumbers=numbers1[0];
        for (int i = 1; i < numbers1.length; i++) {
            if (numbers1[i]<smallestNumbers) {
                smallestNumbers=numbers1[i];

            } System.out.println("Smallest number is"+smallestNumbers);

        }


    }
}
