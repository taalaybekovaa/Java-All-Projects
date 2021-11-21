package String;

import org.w3c.dom.DOMStringList;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string value");

        String value= input.nextLine();
        System.out.println(value);

        value=value.trim();
        System.out.println(value);

        value=value.replace('a','*');
        System.out.println(value);
        value=value.replace("e","**");

        value=value.toUpperCase();
        System.out.println(value);

        int indexOfStar=value.indexOf('*');//Goes from left to right
        // if we write 5 the index will find the star after index 5
        System.out.println(indexOfStar);
        System.out.println(indexOfStar*10);

        value.charAt(4);
        value.charAt((value.length()-1)/2);

        value.indexOf("a");
       int index= value.indexOf(value.charAt((value.length()-1)/2));
        System.out.println(index);












    }
}
