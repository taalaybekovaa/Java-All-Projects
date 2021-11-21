package Primitives;

public class Precedence {

    public static void main (String[] args){

        int count=10+15;
        int count1=count+3*5;//25+15

        System.out.println(count);//25
        System.out.println(count1);//40

        int count2=count-count1/2*3;//-35
        System.out.println(count2);

        int count3=6/3*5%3;
        System.out.println(count3);//1-is reminder

        int count4=6-4-count+count3;
        System.out.println(count4);//-22

        System.out.println("Total of count3 and count4 -->"+(count3+count4));

        //$50 for food,$250 for electronic, $80 shoes
        // 10%                   20%        15%
        //totalTax=(50*0,10)+(250*0,20)+(80*0,15);
        //System.out.println(totalTax);
        //totalPayment =50+250+80+(50*0,10)+(250*0,20)+(80*0,15);
        double payment=50+250+80+(50*0.10)+(250*0.20)+(80*0.15);
        System.out.println(payment);

        double number=((20*(.1+500)*2+30)*.07);
        System.out.println("number-->" + number);







    }
}
