package Primitives;

public class DataTypes {
    public static void main (String[] args) {

    /*
    there 8 different primitive data types

    bites, short, int, long, float, double --> for numbers
    char --> single character
    boolean--> for true or false options
     */

    byte number = 6;
    //byte number2=129; for byte the range is -128 to 127.that's why it will show compile time error
    short number3 = 1;
    short number4=31789;

    int number5=32_000;// You can use your underscore (_) in between digits.It's not going affect the value

    int number6=1000_000;//You can use your underscore (_) in between digits.It's just to read the digit more easy

        System.out.println(number6);
        //long number7 = 54356457576578578;//it's not going to compile bc Java takes numbers as an Interger number
        long number8 = 543564564675765778l; //Ypu should use 'L/l at the end of long values. It's not going to show,
        // it just to understand Java that is a long number
        System.out.println(number8);

        //Task: Create a new class under Primitive package name it as: MultipleVariableTask
        //In this class, create three long numbers on the same line print out a message as following:
        //"My numbers are : <number1>", <number2> and <number3>"

        float number9 =2.3f; // // you should use 'f/F' at the end of float values
        float number10=56; //56.0 --> 56 //56 ==> 56.0 can be readed without point and in the end
        float number11=56.0f;
         //2.3  56.0 -->56
        System.out.println("Value of number10--> "+number10);
        // int a =5.6; you can not store decimal value in int data type

        double number12=2.1;//The difference is double more capable
        //most common primitive data type usages are int, double, long, boolean
        double number13=89; //89 -->Any numbers whole or single oe double
        System.out.println(number12);


    }
}


