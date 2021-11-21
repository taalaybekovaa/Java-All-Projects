package String;

import java.util.Locale;

public class Methods4 {

    public static void main(String[] args) {

        String a="John";
        String b="John";
        boolean bl1= a.equals(b);//--->true Returnin type is going to be boolean again
        System.out.println(bl1);

        boolean bl12=a.equals("John"); //-->true
        String c="JOHN";
        System.out.println(bl12);

        boolean bl3=a.equals("c");//:-->false.It has to be the same
        System.out.println(bl3);

        //equalsIgnoreCase();

        boolean bl25=a.equalsIgnoreCase(c);//True .The result you cvna store in Boolean
        System.out.println(bl25);

        System.out.println("Java is".equalsIgnoreCase("JAVA is"));//True
        System.out.println("Java is cool".equalsIgnoreCase("Java is"));//False

        String str1="Java is cool";
        System.out.println(str1.equalsIgnoreCase("COOL"));
        //We can't do it beacuse this method trying to find matching data

        System.out.println(str1.contains("COOL"));

        //replace() it will replace original value with the new one

        str1=str1.replace('o','$');
        System.out.println(str1);

        str1=str1.replace("c$$l","easy" );
        System.out.println(str1);

        String text1="Tava";
        str1=str1.replace("Java",text1);
        System.out.println(str1);

        System.out.println(str1.replace("***","???"));//It's going act as nothing
        String star="Star of the day is *";
        System.out.println(star.replace("*","$$$$"));

    //Trim()

        String text2="     It is Saturday   ";
        System.out.println(text2);

        text2=text2.trim();
        System.out.println(text2);

        //"Do whatever it takes"
        /* concat with to learn Java"
        make everything to uppercase
        replace "Java" with 'JOB'
        check if the text contains "Chicago"
         */
        String text4=" Do whatever it takes";
        text4=text4.concat ("to learn Java");
        System.out.println(text4);
        text4=text4.toUpperCase();
        System.out.println(text4);
        text4=text4.replace("JAVA","JOB");
        System.out.println(text4);

        text4.contains("Chicago");

        System.out.println(text4);



    }
}
