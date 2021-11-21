package Homework8;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
/*13. Write a program in Java to make such a pattern like a pyramid with numbers increased by 1. For this task ask the user to enter a number of the line.
Example: Please enter line number:
4
Expected output:
1
2 3
4 5 6
7 8 9 10
NOTE: You need to use the nested loop
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number of line ");
        int numberOfLine = scan.nextInt();
        int add = 1;
        for (int i = 1; i <= numberOfLine; i++) {//numbers of line
            for (int x = 1; x <= i; x++) {
          System.out.print(add + " ");
                add++;
            }
            System.out.println();
        }
    }
}