package Primitives;

import java.sql.SQLOutput;

public class CastingPractice {
    public static void main(String[]args){

        long l1=120;
        //int i1=l1;Larger data type cannot be store in small data type

        int i2=(int)l1;//Explicit casting (Auto narrowing) Which means that you making it smaller)

        double db1=l1;//implicit casting(Auto widening)

        short apple=800;
        short samsung=600;

        short total =(short)(apple+samsung);// Making the casting change total as a short so i can add short
        System.out.println(total);

        byte total1 =(byte)(apple+samsung);
        System.out.println("Total1-->"+total1);


        double d1=2.3;
        int i=12;

        i+=d1; //i=i+d1 12+2.3=14.3 It's working because of the compound assignment //when you do compound assignment, you don't need to do
        //explicit casting

        System.out.println("i-->"+i); //14

        int i3=(int)d1;
        System.out.println(i3);

        //int i3=(short)d1;  We can cast to the smaller type of the data as a sort
        //System.out.println(i3);

    }
}
