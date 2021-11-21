package Loops;

import java.util.Enumeration;

public class ForLoop2 {

    public static void main(String[] args) {

        //Print out the letters from a given string value
        // Chicago

        String city
                = "Chicago";

        for (int i = 0; i <= city.length() - 1; i++)

            System.out.println(city.charAt(i));

        for (int index = city.length() - 1; index >= 0; index--) {
            System.out.println(city.charAt(index));
        }
        String name = " Chicago";

        String string = " Today is the day to practice loop";
        int count = 0;
        for (int k = 0; k < string.length(); k++)

            if (string.charAt(k) == 'o') {
                System.out.println(string.charAt(k));
                count++;
                System.out.println("count is "+(k));
                System.out.println("the index number of"+count+".'o' is "+k);//It's  going to show you which o is coming from which index
            }

        System.out.println("count is " + count);



        }
    }
