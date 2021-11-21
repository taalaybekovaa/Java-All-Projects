package OOP.InheritanceTask;

public class Vehicle  {
/*
    Methods:
    drive(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return Object
 */

    protected String model;
    int year;
    public String brand;

    public Vehicle() {

    }
    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public static void Drive(){

        System.out.println(" is driving");
    }

    public void Move() {
        System.out.println(" is moving");

    }

    public boolean Stop( ){
        System.out.println(" is stopping");
        return true;
    }

    final protected boolean Start(){
        System.out.println(" is starting");
        return true;
    }

   Object accelerate (){
       return new Object();
   }

}

