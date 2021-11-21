package Project3;

public class Converter {

    public static void main(String[] args) {

        double dollarAmount = 2.36;
        double dollarAmountInPennies = dollarAmount * 100;//2.36*100
        System.out.println(dollarAmountInPennies);//236

        int quarter = (int)( dollarAmountInPennies / 25);//236/23=9.44-->casted to int =9. Not 0, 25 because we need to convert
        System.out.println(quarter);//9

        dollarAmountInPennies = dollarAmountInPennies - quarter * 25;//236-9*25==11
        System.out.println(dollarAmountInPennies);

        int dime = (int)(dollarAmountInPennies / 10);//1 dime
        System.out.println(dime);

        dollarAmountInPennies = dollarAmountInPennies - dime * 10;//11-10 remainder 1


        System.out.println(dollarAmountInPennies);

        int nickel = (int)(dollarAmountInPennies / 5);//0,11-0,10-0.1.    0.1?0.05=0
        System.out.println(nickel);

        System.out.println(dollarAmountInPennies);
        System.out.println(" Your amount "+dollarAmount + " is " + quarter + " quarters " + dime + " dime " + nickel + " nickel and " + dollarAmountInPennies + " pennies" );


    }
    }
