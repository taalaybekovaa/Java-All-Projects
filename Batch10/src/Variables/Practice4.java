package Variables;

public class Practice4 {

public static void main (String [] args) {

    /*
    in a farm,
    there are 12 cows and 23 chickens
    each chicken's cost is 10$
    each cow's cost is 500$
    1-calculate the total number of legs of the animals in this farm
    2-calculate the total cost of animals in the farm
     */
    int Cows = 12;
    int Chickens = 23;
    int cowsLegs = 4;
    int chickenLegs = 2;
    int totalCowsLegs = Cows*cowsLegs;
    int totalChickensLegs=Chickens*chickenLegs;

    System.out.println(totalCowsLegs+totalChickensLegs+" is the total number of legs of the animals in this farm");

    int CowsPrice$=500;
    int ChickenPrice$=10;
    int totalCowsPrice=Cows*CowsPrice$;
    int totalChickenPrice$=Chickens*ChickenPrice$;

    System.out.println(totalCowsPrice+totalChickenPrice$+" is a total cost of animals in the farm");

}
}
