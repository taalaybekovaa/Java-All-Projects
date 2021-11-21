package Primitives;

public class LogicalNegation {

    public static void main (String[]args){

        boolean haveMoney=false;

        System.out.println(haveMoney);//false

        //!havemoney=false;We cannot start because we don't have this variable-compile time error
        System.out.println(!haveMoney);//
        boolean isCarOn=true;
        isCarOn=false;
        System.out.println(!isCarOn);




    }
}
