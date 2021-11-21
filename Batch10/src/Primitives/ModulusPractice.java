package Primitives;

public class ModulusPractice {
    public static void main (String []args){

        //arithmetic operators are +,-,*, /,% (modulus)
        // % (modulus will give the remainder of division)

        int studentCount = 9;
        int divisor=2;
        int resultOfDivision;

        resultOfDivision=studentCount/divisor;
        System.out.println("The result is--> " +resultOfDivision);

        int remainder=studentCount% divisor;
        System.out.println("The remainder is --> " + remainder);

        double remainder1=studentCount% divisor;
        System.out.println(remainder1);

        //% modulus find the reminder

        int x=15;
        int result = x % 6; //3 is reminder
        System.out.println(result);


    }
}
