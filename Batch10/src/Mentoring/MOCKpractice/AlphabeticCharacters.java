package Mentoring.MOCKpractice;

public class AlphabeticCharacters {

    public static void main(String[] args) {

        //Print out only letters, then digits, than special characters


        String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String letters = "";
        String digits = "";
        String characters = "";

        for (int i = 0; i < given.length(); i++) {
            char ch = given.charAt(i);
            if (Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch) && !Character.isAlphabetic(ch)) {
                digits += ch;
            } else {
                characters += ch;
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(characters);
    }
}

