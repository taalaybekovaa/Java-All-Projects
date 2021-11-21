package MocPractice;

public class swapNumbers {

    // Write a program to swap 2 numbers without a temporary
    // variable? Swap 2 strings without a temporary variable?
    // swap numbers- it's means change the oder of the numbers
    //swap numbers
    public static void main(String[] args) {
    int a=5;
    int b=10;

    a=a+b; //15
    b=a-b;//5
    a=a-b;  //15-5
    System.out.println(a);
    System.out.println(b);

    //swap strings
     String x =" Hello";
     String y= "Techtorial";
     x=x+y;//HelloTechtorial
     y=x.substring(0,(x).length()-y.length());//  It's means we substring from 0 to all length -delete length y
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);




















    }
}
