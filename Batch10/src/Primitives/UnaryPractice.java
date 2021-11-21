package Primitives;

public class UnaryPractice {

    public static void main(String[] args) {

        //DD buy 12 get a dollar off next time and
        //KK buy 12 and pay 11 now

        int DD=12;
        int KK=12;

        System.out.println("Payment for DD "+DD--);
        System.out.println("Payment for KK "+--KK);
        System.out.println("DD I am back "+DD);
        System.out.println("KK i am back "+KK);

        KK-=5;
        System.out.println(KK);

    }
}
