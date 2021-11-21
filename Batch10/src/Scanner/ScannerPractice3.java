package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your full name ");

        String fullName=scanner.nextLine();//Scanner will take only the next word instead of the line if you want also read next line use ln
        System.out.println("Your full name is " + fullName);

        System.out.println("Please enter your state");
        char firstLetter=scanner.next().charAt(3);//indexing which is the position illinois count is 8 //
        // 0-shows the first letter if you use 012 -will show 3 letters
        // of the letters in the String 01234567
        System.out.println(firstLetter);





    }
}
