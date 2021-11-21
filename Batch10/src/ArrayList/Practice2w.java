package ArrayList;

import java.util.ArrayList;

public class Practice2w {
    public static void main(String[] args) {


    /*Task:
Create a pra ctice list to store 5 colors and use traditional for loop to print out each element from the arraylist.
store 5 different colors in that arra
List
use traditional for loop to print out each elemnt from array list



     */
        ArrayList <String> colors = new ArrayList();//or ArrayList<>() optional

        colors.add("white");
        colors.add("black");
        colors.add("orange");
        colors.add("pink");
        colors.add("blue");

        System.out.println(colors);

        for (int i=0;i< colors.size();i++){
            System.out.println(colors.get(i));
        }
        for(String color :colors){
            System.out.println("This is from each loops>> "+color);
        }
        //name method as >> printFruits
        //create a method that will take arrayList as a parameter
        //print the elements if they have 5 or more letters;
        ArrayList<String> fruitNames= new ArrayList<>();
        fruitNames. add("kiwi");
        fruitNames.add("plum");
        fruitNames.add("orange");
        fruitNames.add("banana");
        fruitNames.add("lemon");
       // printFruits(colors);
      Practice2w object=new Practice2w();
      object.printFruits(fruitNames);


        }
        //remove the short fruits from the ArrayList

    public static void printFruits(ArrayList <String> fruits){
        /*for(String fruit: fruits){
        if (fruit.length() >=5){
            System.out.println(fruit);
        }else{
            fruits.remove(fruit);
        }
        }*/

        for (int i=0; i<fruits.size();i++){
        }

    }
}
