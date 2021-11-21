package Object;

public class Animal {

    //instant variables
    String name;//declaring
    int age;
    double weight;
    int legNumber;
    double energy=100;



    public void run(String destination) {// creating a method
        energy-=10;
        System.out.println(name + " is running"+destination);
        //create a sleep method and print --> "...is sleeping"
        // make every animal sleep


    }

    public void sleep() {
        energy=100;
        System.out.println(name + " is sleeping");
    }

//create PrinInfo() method to print out all information
//about the animals

    public void printInfo() {
        System.out.println("Name is "+name+" age is"+age+" weight is "+weight+" leg number "+legNumber+ " Energy is : " +energy);

    }
}

