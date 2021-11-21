package Homework2;

public class PseudoCode {

    public static void main (String [] args){

        //Result 1:Step # 1 If there are more than 1 operation on the same line:
        // multiplication or division ot modulus should be solved first from left to right:

        int r1=4*7,r2=2*9,r3=r2%5,r4=r3/3;

        //Step # 2 If there are more operation on the same line addition or
        // subtraction, you should solve it from left to right:

        int r5=r1+3,r6=r5-r4,r7=r6-2;

        //Step # 3 Print out the result of r7 using println method.//

        System.out.println ("The sum od the operations is " +r7 +".");

        //Step # 1 If there are more than 1 operation on the same line:
        // multiplication or division ot modulus should be solved first from left to right:

        int operation1=3/3,o2=2*2,o3=o2%4,o4=12%3,o5=o4/3;

        //Step # 2 If there are more operation on the same line addition or
        // subtraction, you should solve it from left to right:

        int o6=12-operation1,o7=o6+4,o8=o7-o3,o9=o7+o5;

        //Step # 3 Print out the result of r7 using println method.//

        System.out.println("The sum of the second operation is "+o9+".");

    }

}
