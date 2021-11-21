package Object;

public class AnimalTest {

    public static void main(String[] args) {

        Animal cat= new Animal();//create an object
        System.out.println(cat.name);
        cat.name="Tom";
        System.out.println(cat.name);

        cat.age=5;
        cat.weight=8.5;
        cat.legNumber=4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);
        //craete a dog object and init each variable and print them out

       Animal dog= new Animal();
        System.out.println(dog.name);
       dog.name="Leo";

        dog.age=3;
        dog.weight=56.7;
        dog.legNumber=4;

        System.out.println(dog.name);
        System.out.println(dog.age);

        Animal bird= new Animal();

        System.out.println(dog.weight);
        System.out.println(dog.legNumber);

        //cat.run();
        dog.run("west");

        //print out all information for ecah animal at one

        cat.sleep();
        dog.sleep();
        bird.sleep();

        cat.printInfo();
        bird.printInfo();
        bird.legNumber=2;
        dog.printInfo();


        System.out.println("==================");
        cat.energy=100;
        cat.printInfo();
        cat.run("Up");
        cat.printInfo();
        cat.run("South");
        cat.run("Down Stairs");
        cat.printInfo();
        cat.sleep();
        cat.printInfo();


        //===========================================

        bird.energy=100;
        bird.sleep();
        bird.run("in to air");














    }
}
