package Homework7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!Please create a username :");
        String usernameNew = scan.nextLine();
        System.out.println("Please create a password");
        String passwordNew = scan.nextLine();

        int counter = 3;

        while (true) {
            System.out.println("Please enter your username");
            String username = scan.nextLine();
            System.out.println("Please enter your password");
            String password = scan.nextLine();

            if (username.equals(usernameNew) && password.equals(passwordNew)) {
                System.out.println("You logged in successfully");
                break;

            } else {
                counter--;
                System.out.println("Invalid username or password. Please try again " + counter + " trial left.");
                if (counter == 0) {
                    System.out.println("Unfortunately, your account is on hold now.Try after 5 min");
                    break;
                }
            }
        }
    }
}

