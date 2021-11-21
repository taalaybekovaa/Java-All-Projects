package Project3;

public class FiveDigit {
    public static void main(String[] args) {

        int myNumber=53876;

        int firstNumber=myNumber%10;
        System.out.println(firstNumber);
        myNumber=myNumber/10;

        int secondNumber=myNumber%10;
        System.out.println(secondNumber);
        myNumber=myNumber/10;

        int thirdNumber=myNumber%10;
        System.out.println(thirdNumber);
        myNumber=myNumber/10;

        int forthNumber=myNumber%10;
        System.out.println(forthNumber);
        myNumber=myNumber/10;

        int fifthNumber=myNumber%10;
        System.out.println(fifthNumber);
        myNumber=myNumber/10;

        System.out.print("Your number reversed is "+ firstNumber+secondNumber+thirdNumber+forthNumber+fifthNumber) ;









    }
}
