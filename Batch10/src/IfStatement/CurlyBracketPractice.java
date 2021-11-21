package IfStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {

       int appleNumber=40;
       int orangeNumber=30;

       if (appleNumber>orangeNumber){
           appleNumber++;
           System.out.println("There are more apples in the store than oranges"+appleNumber);
       }
        if(orangeNumber>appleNumber) //If we delete the curly braces from here in case of false it will
            // show you the result below and skip the very first line after sentence.
            // In case if it's true it is going to show you the all result
            // If
            // there are the braces in case of false it's going to skip to the next line
             orangeNumber++;
        ++orangeNumber;
    System.out.println("there are more oranges in the store than apples "+orangeNumber);



        }
    }
