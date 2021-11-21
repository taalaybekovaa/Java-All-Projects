package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList <String> cars= new ArrayList<>();
        cars.add("Honda");
        cars.add("Tofas");
        cars.add("Lada");

        Object [] cars1= cars.toArray();//You can store everything even string inside

        //String [] car= (String [])(cars.toArray());If you want store only String you can use this

    }
}
