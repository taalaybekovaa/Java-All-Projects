package Primitives;

public class CharPractice {
    public static void main (String [] args){
        char firstLetter='A'; //Value for a char data type needs to be in the single quotation mark ('A')

        System.out.println(firstLetter);
        //char secondLetter='AA"-it's not going to work, we have to use single character

        char secondLetter='6';//it s a character and not number
        System.out.println(secondLetter);

        char thirdLetter='^';
        System.out.println(thirdLetter);
        char forthLetter=66;//It's from ascii table,it will read the meaning of 66
        //char forthLetter1='66';you van store only single character in single quotation mark for char

        char fifthLetter = 29000;
        System.out.println(fifthLetter);

        char x =42;//If you assign the number for a char data type ,it will print  a symbol from ASCII table
        System.out.println(x);
        double d ='?';//If you assign symbol or character from ASCII table it will
        //print the number for value for it
        System.out.println(d);
        int g = '!';
        System.out.println(g);

        int b = '2';
        System.out.println(b);
        int c = '@';
        System.out.println(c);
        int f='C', k='K', o='G', t='T', e='E', m='M';
        System.out.println("" +c+k+" "+g+t+e+m);//
        System.out.println(c+k+o+t+e+m);


    }
}
