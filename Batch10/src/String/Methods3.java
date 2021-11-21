package String;

import java.util.Locale;

public class Methods3 {

    public static void main(String[] args) {

        String string="Selenium";

        //ToUpperCase() it will convert all strings to upper case

       string= string.toUpperCase();
        System.out.println(string);

        string.toLowerCase();
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string);
        string=string.toLowerCase();
        String a=" " +string.charAt(0);
        a=a.toUpperCase();
        System.out.println(a+string);

        String word="do whatever it takes";


        System.out.println(word.startsWith("do"));//-->true
        System.out.println(word.startsWith("What"));//-->false //Must be exactly same letters
        boolean result1=word.startsWith("d");//-->true
        System.out.println(result1);
        boolean result2= word.startsWith("d o");//--false
        System.out.println(result2);
        word.startsWith("do w"); //-->true
        System.out.println(word.startsWith("Do"));//false
        System.out.println(word.startsWith("do whatever it takes"));//true


        //endsWith();======
        word.endsWith("do"); //-->false because last chars is s
        System.out.println(word.endsWith("s"));//true
        System.out.println(word.endsWith("es"));//true
        System.out.println(word.endsWith("takes"));//true
        System.out.println(word.endsWith("takeS"));//false
        System.out.println(word.endsWith("it"));//false

        String text="Techtorial";
        System.out.println(text.contains("t"));//true

        text=text+word;//because reassigned with do
        System.out.println(text.contains("do"));//true
        System.out.println(text.contains("for"));//false
        System.out.println(text.contains("i"));//true






    }




}
