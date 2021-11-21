package OOP.Inheritance;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.color);
        animal.color="Brown";


        WildAnimal wildAnimal= new WildAnimal();
        System.out.println(wildAnimal.color);

        Cat cat = new Cat();
        System.out.println(cat.color);

        animal.color="Brown";
        System.out.println(animal.color);
        System.out.println(cat.color);

        Lion lion = new Lion();
        System.out.println(wildAnimal.color);
        System.out.println(lion.name);// taking the value by default from parent class wioth is wildAnimal

        DomesticAnimal domestic = new DomesticAnimal();
        System.out.println(domestic.name);
        domestic.name="Rex";
        System.out.println(domestic.name);
        System.out.println(cat.name);
        animal.eat();
        lion.eat();
        wildAnimal.eat();
        lion.eat();
        lion.run();






    }
}
