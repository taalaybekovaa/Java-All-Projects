package OOP.Inheritance;

public class Lion extends WildAnimal {

public void eat(){
    System.out.println("Lion is eating");
}

//    public int sleep() {
//        System.out.println("Lion is sleeping");
//        return 4;
//    }
    public WildAnimal run(){
        System.out.println("Lion is running");
        return new Lion();
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }
}
