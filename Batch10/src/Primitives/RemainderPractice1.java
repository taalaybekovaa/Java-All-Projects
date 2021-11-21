package Primitives;

public class RemainderPractice1 {

    public static void main(String []args) {

        //123 find the sum of the digits from given number
        //1+2+3=6 --> print "The sum of digits = 6"

        int number = 123;

        int firstDigit =number%10; //123 /10 --> 12 Remainder is 3. We have to find the remainder because we need to access 12

        System.out.println("First digit or first remainder: "+firstDigit);

        number=number/10;// To access to 12 Making the number smaller

        System.out.println(number);

        int secondDigit =number%10; // Here we have to find the remainder of 12 --> 12/10--> 1 Remainder is 2 and the second digit right now is 2

        number=number/10; // 12/10=1

        System.out.println(secondDigit);

        int thirdDigit =number % 10;//1/10 making the number smaller and the reminder is 1.The last digit is 1

        System.out. println(thirdDigit);

        int totalSumOf123=firstDigit+secondDigit+thirdDigit;

        System.out.println("The sum of digits is ="+(totalSumOf123));

        int number1=456;

        int forthDigit=number1%10; //Here we are found the reminder of 456 is 6 and it is the 4th digit

        System.out.println(forthDigit);

        number1=number1/10; // We made the number of 456 smaller by 10 and reassigned the number for 45

        System.out.println(number1); //The number changed for 45

        int fifthDigit= number1%10; //45/10 The reminder is 5 and it will be out fifth digit

        System.out.println(fifthDigit);

        number1=number1/10; //We made number 45 smaller and the number is 4 now and reminder is 5

        int sixthDigit=number1%10;

        System.out.println(sixthDigit);//Reminder is 5 and it is thr fift

        int totalSumOf456=forthDigit+fifthDigit+sixthDigit;

        System.out.println(forthDigit+fifthDigit+sixthDigit);

        System.out.println(totalSumOf123+totalSumOf456);
    }
}
