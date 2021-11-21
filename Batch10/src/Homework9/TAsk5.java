package Homework9;

import java.util.Scanner;

public class TAsk5 {
 /* You have an array of weather conditions withFahrenheit numbers. The size of the array
        will be 6. Print the Celsius value of each array element.   */

    public static void main(String[] args) {

            int[] weatherTemp = {75, 78, 71, 68, 69, 110, 91};
            for (int i = 0; i <= weatherTemp.length - 1; i++) {
                double C = (weatherTemp[i]-32)/1.8;
                System.out.println("Today Temp is " + C);
            }
        }
}
