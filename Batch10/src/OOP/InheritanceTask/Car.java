package OOP.InheritanceTask;

public class Car extends Vehicle {

    /*
-Car
  *extends Vehicle
  variables:
    model;
    engineType;
  Methods:
    Override drive(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
     */

    String model;
    String engineType;

    public Car(String model, int year, String brand) {
        super(model, year, brand);
    }

    public static void Drive() {
        System.out.println("Car is moving");
    }

    @Override
    protected Integer accelerate(){
        System.out.println(super.model);
        return 5;
    }
}

