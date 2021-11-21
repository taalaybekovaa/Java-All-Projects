package PolymorphismPractice;

public class Test {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.checkingAccountBalance();

        Bank bank = new Bank();
        bank.openAccount();

    }
}
