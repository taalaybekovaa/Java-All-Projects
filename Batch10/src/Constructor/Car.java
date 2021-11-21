package Constructor;

public class Car {

        /* create a car class with instance field of brand of the car
    create one move method to simply print out " car is moving"
    create a constructor to initialize instance varibles
    create a test calls to test this car class
    inside of the test class create multiple objects
    sent some of the object to garbage
    call garbage collector
    make sure gc() is working;
     */

    String brand;

    public void move() {
        System.out.println(brand + "is moving");
    }
    public Car(){
    }
    public Car(String brand){
        this.brand="brand";

    }

    @Override
    public String toString() {
        return "the brand of the car is "
                +brand;

    }


}
