package MocPractice;

public class palindrome {
    public static void main(String[] args) {
        // Write a program which will check if String is palindrome or not

        String original = "Madam";
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
            if(original.equalsIgnoreCase(reverse)){
                System.out.println(" Your word is a palindrome");
            } else{
                System.out.println(" Your word is not a palindrome ");
            }

        }
    }
