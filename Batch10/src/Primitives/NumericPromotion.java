package Primitives;

public class NumericPromotion {

    public static void main (String []args){

        byte b1=112;
        short sh1=30;

        //short sum3=b1+sh1;Because JAva wants to put them as int

        // byte sum1=b1+sh1;it will not compile bc of the NumericPromotion
        int sum1=b1+sh1;//java promote smaller data types byte, short to int data types

        float fl1=2.3f;
        double db1=3.4;
        //float sum2=fl1+db1; compile time error

        System.out.println(fl1+db1);

        double sum2=fl1+db1;
        System.out.println(sum2);
        //int product sum1*sum2; The result is a decimal number, thats why you can't store it in a ind data type
        double product1=sum1*sum2;

        int i1=23;
        double db2=i1;
        //int i2=db2;
        //long l1=db2;It will not compile
        //long l1=db2; will not compile because of the capacity and type


    }


}
