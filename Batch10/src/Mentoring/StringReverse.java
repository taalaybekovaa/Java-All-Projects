package Mentoring;

public class StringReverse {

    // Without using inbuilt method
    // creating a new string variable
    //write a method to reverse a string

    public String reverseString(String str) {
        for (int i = str.length()-1; i >=0 ; i++) {
            str += str.charAt(i);
            //I am going to have the word and reversed version
            //If I remove the first portion
        }
           return str.substring(str.length()/2);

        }

    public static void main(String[] args) {
        System.out.println("Techtorial");
    }

        }



