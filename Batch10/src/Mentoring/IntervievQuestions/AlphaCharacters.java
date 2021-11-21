package Mentoring.IntervievQuestions;

public class AlphaCharacters {

    public static void main(String[] args) {
//Print out only letters, then digits, than special characters

        String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String onlyAlphabets="";
        String onlyDigits="";
        String onlySpecial="";

        for(int i=0; i<given.length(); i++){
            char ch=given.charAt(i);
            if(Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
                onlyAlphabets += ch;
            }else if(!Character.isAlphabetic(ch) && Character.isDigit(ch)){
                onlyDigits+=ch;
            }else{
                onlySpecial+=ch;
            }

        }
        System.out.println(onlyAlphabets);
        System.out.println(onlyDigits);
        System.out.println(onlySpecial);
    }
}