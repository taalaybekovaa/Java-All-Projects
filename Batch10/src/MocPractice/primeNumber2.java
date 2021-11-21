package MocPractice;

public class primeNumber2 {

    public static void main(String[] args) {


        //
        int num = 59;
        boolean isPrime = false;

        for (int i = 2; i <= num/2; ++i) {
            // condition for non prime number
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}