package Array;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] colors = {" Red", "Yellow", " brown", "Blue", "White", "Orange",
                "Green", "Pink", "Violet", "Black"};
        Arrays.sort(colors);
// for each loop --> it will start from beginning of the array and go to the end of it
        for (String color : colors) {
            // data tyoe name of the storage  what we have and than name of the storage what you wanna do
            System.out.println(color);//will show you all words
        }
        int[] ids = {9, 5, 8, 23, 45, 12, 50, 30, 100, 11};
// use for each loop to print iut these elements from n array
        // print out only numbers they are 50 or greater

        for (int numbers : ids) {
            //System.out.println(numbers);

            if (numbers >= 50) {
                System.out.println(numbers);
            }
        }
        char[] characters = {'g', '1', 5, '$', '*', 'A', 'H'};
        for (char letters : characters) {
            if ((letters >= 'a' && letters <= 'z' || letters >= 'A' && letters <= 'Z')) {
                System.out.println(letters);

            }
        }
        for(char ch:characters){

              if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
                  System.out.println(ch);
              }
            }// Print all other symbols by using above methods//
        for(char ch: characters){
            if(!Character.isAlphabetic(ch) && !Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
        }
    }




