package Loops;

public class CharPractice {

    public static void main(String[] args) {

        //Print out alphabet in uppercase letter

        for( char ch='A',ch1='b';ch <='Z' && ch1<='z'; ch+=2, ch1+=2){
            System.out.print(ch+"-");
            System.out.print(ch1+"-");}// one letter uppercase one letter lowercase


    }
}
