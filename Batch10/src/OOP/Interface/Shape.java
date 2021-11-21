package OOP.Interface;

public interface Shape {

    int SIDE = 5;
    //int SIDE= 5;
    //void area();// you cannot have simple methods except exception

    Number area(int side);
    Number perimeter();

    default void info() {
        System.out.println("I am info about Shape Interfaces");
    }

    default void info(String nameOfShape) {
        System.out.println("I am info about shape Interface");
    }

    static void info2() {
        System.out.println("");

    }
   // protected void info3(){ you cannot use protected

    }

