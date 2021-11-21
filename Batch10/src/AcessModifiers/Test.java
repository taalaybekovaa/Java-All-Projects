package AcessModifiers;

public class Test {

    public static void main(String[] args) {

        Animal animal= new Animal();
        animal.run();//protected
        animal.swim();//default
        animal.age=12; // default
        animal.name="Leo";//public
        animal.gender="M"; //protected

    }


}
