package String;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");

        String str= input.nextLine();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));//For last char
        System.out.println(str.indexOf("c", str.indexOf("c")+1));
        System.out.println(str.length());
        System.out.println(str.indexOf('x'));




    }

}
