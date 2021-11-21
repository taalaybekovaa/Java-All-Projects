package Loops;

public class ReverseString {
    public static void main(String[] args) {
        // Selenium: reverse it and print it as a new string as reversed version
        //muineleS

        String word="muineleS";
        String updated=" ";

        for(int index=word.length()-1;index>=0;index--){//starting from the end
            updated+=word.charAt(index);
            System.out.println(updated);
        }
        System.out.println("Final version is"+updated);
        if(word.equalsIgnoreCase(updated)){
            System.out.println("The word is palindrome"+word);
        }else{
            System.out.println("The word is not a palindrome"+word);
        }
        }
    }// check if the string is polindrom or not
