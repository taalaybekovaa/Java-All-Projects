package String;

public class StringBasics {

    public static void main(String[] args) {

        String text="School";
        String name=new String ("Altynai");

        System.out.println(text);
        System.out.println(name);

        text=text+" is Techtorial";
        System.out.println(text);

        text+= " Academy";
        System.out.println(text);
        //text-= "abzndndl";

        //text-= "Academy"; It's not going to work because it's not mat operations. Yo can't use -, *,
        // / or % with String
        // and combining them together is called concatenation

        String word= name+text;
        System.out.println(word);
        System.out.println(word+"5");
        System.out.println(word);

        name=name+text;
        name +=text;
        System.out.println(name);

        String str="Java";
        String str1="Selenium";
        String result=str+" "+str1;
        System.out.println(result);
        System.out.println(str1+" is next");
        System.out.println(str+" is first");
        System.out.println(result + str+str1);//-->

        str=str+5+6;
        System.out.println(str);

        str1=str1+"5"+"6";//its showing11 because it is the first operator
        System.out.println(str);
        result=5+6 +result;
        System.out.println(result);
        str="Java";
        //str=str+5*6+2+5;
        str=str+5+2*6;//512
        System.out.println(str);
        System.out.println(str+15/3);
        str="Java";
        int a=12;
        str.concat(" is cool");//It will not show up. To show up the text we have to reassign the value
        System.out.println(str);

        str=str.concat(" is very easy");
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);



    }
}
