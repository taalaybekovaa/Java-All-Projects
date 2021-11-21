package OOP.Inheritance3;

import java.util.TreeSet;
import java.util.logging.XMLFormatter;
public class Mall {

    public static void main(String[] args) {

        Shirt shirt = new Shirt("L",26);
        System.out.println(shirt.price);
        //shirt.COLOR="Red"; you can not re-assign value for final variable

        Tshirt tShirt = new Tshirt();
        //  tShirt.COLOR = "Black"; you can not re-assign value for final variable

        tShirt.color = "orange";
        System.out.println(tShirt.COLOR);
        Shirt tShirt1 = new Tshirt();
        System.out.println(tShirt1.COLOR);
        System.out.println(tShirt.color);


    }
}