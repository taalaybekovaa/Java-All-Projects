package MocPractice;

public class alphaCharacters {

    public static void main(String[] args) {

        //How many AlphaCharacters presents in a string
//        String given= "h7!";
//        String replaced=given.replaceAll("[!A-Za-z]", "");
//        System.out.println(replaced.length());

        String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String isAlphabetic="";
        int count=0;

            for (int i = 0; i < given.length(); i++) {
            char ch=given.charAt(i);
            if(Character.isAlphabetic(ch)){
                isAlphabetic+=ch;
                count++;

            }

        }
        System.out.println(count);

    }
}
