package Array;

import java.util.Arrays;

public class SplitPractice1 {

    public static void main(String[] args) {

        String date = "12.03.2021";//mm//dd//yy
//check if the month is 12 and print out if it's correct month;to be able use it as a split u need use (.) double\p
        String[] splittedDate = date.split("\\.");
        System.out.println(Arrays.toString(splittedDate));

        if (splittedDate[0].equals("12")){//for string only equals
            System.out.println("It is correct month");
    }
    String date1="11/03/2021";
   String [] splitDate1=date1.split("/");
        System.out.println(Arrays.toString(splitDate1));

        String text=" My favorite color is \"blue\".\nHow about you?\t \\ ";// short cut to play with the string
       // \r-remove the previous string
        System.out.println(text);
   }
}


