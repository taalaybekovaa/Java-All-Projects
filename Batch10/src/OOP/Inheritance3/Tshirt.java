package OOP.Inheritance3;

public final class Tshirt extends Shirt {

    String color;
    public Tshirt(){
        super("M", 25);
    }

    //   @Override  >> you can not override a final method
//    public String info() {
//        return "This is info about T-Shirt";
//    }
}