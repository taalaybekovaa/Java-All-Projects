package Methods;

public class BAnkAccount {
    String bankNAme;
    int accountNumber;
    double balance;
    boolean loggedIn;
    String accountHolderName;
    String userNAme;
    String password;

    // create a method that will display all of the account information
    // create a method named as deposit, it will update the balance
    // create a method named as withDraw, it will also update teh balance
    // create a methoid named as loggin, it will check if the user login or not and this method will return boolean true or false

    public void accountInformation() {
        System.out.println("Your bank name is" + bankNAme + "\n Your account number is :" + accountHolderName + "\n your balance is " + balance + " \n Your account holder name is " + accountHolderName + "\n You logged in" + loggedIn);

    }

    public double deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Your new balance after deposit ammount of " + depositAmount + " is" + balance);
        return balance;
    }

    public double WithDraw(double withDrawAmmount) {
        System.out.println("Your nwe balance after withdrawal amount of " + withDrawAmmount + "is" + balance);
        balance -= withDrawAmmount;
        return balance;
    }

    public boolean LogIn(String user, String pass) {

        if (userNAme.equals(user) && password.equals(pass)) {
            System.out.println("You successfully logedIn");
            loggedIn = true;
        } else {
            System.out.println("Your credentials are not matching.Try again");
        }
        return loggedIn;
    }

    public static void main(String[] args) {
        BAnkAccount java = new BAnkAccount();
        java.accountInformation();
java.accountNumber=12223;
java.accountHolderName="Joe";
java.userNAme="abc";
java.password="123";
java.accountInformation();
java.balance=100_000;
java.accountInformation();
java.deposit(5000);
java.WithDraw(60);
java.LogIn("abc","123");




    }
}