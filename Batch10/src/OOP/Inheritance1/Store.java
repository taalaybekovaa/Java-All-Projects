package OOP.Inheritance1;

public class Store {
    public static void main(String[] args) {
        Flower flower= new Flower("Lily", "viloet", 11);
        Rose rose = new Rose();
        System.out.println(flower.color);
        System.out.println(rose.color);

        Rose rose1 = new Rose("Pink");
        System.out.println(rose1);


        Tulip tulip = new Tulip();
        System.out.println(tulip.color);

        tulip.color="Green";
        System.out.println(tulip.color);

        Flower flower1= new Flower();
        System.out.println(flower1.color);

        Tulip tulip1= new Tulip();
        System.out.println(tulip1.color);

        Tulip tulip3= new Tulip("Tulip", "White", 4.5);


    }
}
