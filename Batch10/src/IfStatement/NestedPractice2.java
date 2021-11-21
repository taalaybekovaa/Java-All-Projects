package IfStatement;

import java.util.Scanner;

public class NestedPractice2 {

    public static void main(String[] args) {
      /* Ask to candidate if she/he knows java
       if yes ask if she knows selenium
       yes>> ask if she knows API testing
       yes>> ask if she knows SQL
       yes>> ask if she knows SQL
       yes>> Congrats!! You are hired!!!

       if Java is no>> print Please learn Java and come back
       if Selenium is NO >> print we need someone who has selenium knowledge
       if API testing is no>> print we need someone who knows API testing
       If SQL is no >> print We need someone who has SQL knowledge

       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you know Java ? Yes/No ");
        String java = scan.nextLine();

        if (java.equalsIgnoreCase("yes")) {//If you put an extra space in " yes" it's not going to work
            System.out.println(" Do you know Selenium? Yes/ No ");
            String selenium = scan.nextLine();

            if (selenium.equalsIgnoreCase("yes")) {
                System.out.println(" Do you know API?");
                String api = scan.nextLine();

                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you SQL?");
                    String sql = scan.nextLine();

                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats, you are hired!!!!");
                    } else {
                        System.out.println(" We need someone who knows SQL");
                    }

                } else {
                    System.out.println(" We need someone who knows API");
                }
            } else {
                System.out.println(" We need someone who knows Selenium");
            }

        } else {
            System.out.println(" Please learn Java and come back");
        }
    }
}



       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Do you know Java? Yes/No ");
        String java= scanner.nextLine();

        if (java.equalsIgnoreCase("yes")) {
            System.out.println("Do you know know Selenium ");
            String selenium = scanner.nextLine();

            if (selenium.equalsIgnoreCase("Yes")) {
                System.out.println(" Do you know API");
                String api = scanner.nextLine();

                if (api.equalsIgnoreCase("Yes")) {
                    System.out.println("Do you know SQL ");
                    String sql = scanner.nextLine();
                    if (sql.equalsIgnoreCase("Yes")) {
                        System.out.println("Congrats, you are hired");
                    } else {
                        System.out.println("We need someone who has SQL knowledge ");
                    }
                } else {
                    System.out.println("we need someone who has API testing ");
                }
            } else {
                System.out.println("We need someone who has Selenium knowledge ");}
        } else {
            System.out.println("Please learn Java first and come back");
        }
    }
}*/