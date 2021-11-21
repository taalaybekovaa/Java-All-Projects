package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {

        /*
        Ask user how many names they want to store
        -store those names in a String Array
 print out those names by using toString() method
         */
    Scanner scan=new Scanner(System.in);
    System.out.println("Hi.How many names you want to store?");
    int size= scan.nextInt();
    String names[]=new String[size];

        for(int i=0;i<size; i++){
        System.out.println("Please enter a name ");
        names[i]=scan.next();

    }System.out.println(Arrays.toString(names));
}
}


