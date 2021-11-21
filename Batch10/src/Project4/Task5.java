package Project4;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 words");

        String words = input.nextLine();

        String firstWord = words.substring(0,words.indexOf(" "));
        System.out.println(firstWord);

        int index1 = firstWord.length()-1;

        System.out.println(index1);

        int index2 = words.lastIndexOf(" ")-1;

        System.out.println(index2);

        int index3 =words.length()-1;

        System.out.println(index3);

        int sum = index1+index2+index3;

        System.out.println(sum);



    }
}
