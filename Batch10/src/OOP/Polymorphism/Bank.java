package OOP.Polymorphism;

public class Bank extends Branch {

    public void loan (){
        System.out.println("Bank can give up to 1M ");
    }
    public void Hire(){
        System.out.println(" Ban can hire for CEO position ");
    }
    public void openAccount(){
        System.out.println(" You cn open business account ");
    }
}
