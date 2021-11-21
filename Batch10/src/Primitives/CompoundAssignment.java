package Primitives;

public class CompoundAssignment {

    public static void main (String[] args){

        int carNumber=7;

        carNumber=carNumber+5;
        System.out.println(carNumber);//12 cars

        carNumber += 5;//reassigned
        System.out.println(carNumber);//17
        carNumber/=2;
        System.out.println(carNumber);//8

        int count;
        count=carNumber*2;
        System.out.println((count));

        int count1;
        //count1+=10 This will not compile(compile time error) because we did not assign the value

        count-=carNumber;//count=count-carNumber; 16-8=8
        System.out.println(count);

        int payment=50;
        payment*=carNumber;//payment*carNumber
        System.out.println((payment));//$400 will pay for 8 cars

        int modulus=1000;
        modulus%=payment;// First java divides 1000 by 400 and finds the remainder, witch is 200 then its assigns the value for modulus value
        System.out.println(modulus);//Showing the reminder







    }
}
