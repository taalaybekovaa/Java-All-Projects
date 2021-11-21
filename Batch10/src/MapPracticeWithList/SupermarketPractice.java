package MapPracticeWithList;

import java.security.Signature;
import java.util.ArrayList;

public class SupermarketPractice {

    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        superMarket.printDairy();

    }

//LETS DO IT STEP BY STEP:

    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein

    String[] dairy = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};

    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles

    String[] chips = {"Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};
    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand

    String[] cookies = {"Nabisco", "Oreo", "Nestle", "Amos", "SnackWell", "MaryLand"};

    //TASK 1:
    //  Create three more arrays to store the prices for these products.
    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,
    double[] dairyPrice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,
    double[] chipsPrice = {3.99, 2.99, 4.99, 3.49, 1.99, 2.69};
    //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,
    double[] cookiePrice = {4.99, 3.99, 5.99, 4.49, 2.99, 3.69};

    //TASK 2:
//    Create the method to print the Dairy.(do it with the list, think about the reason why )
    public void printDairy() {
        ArrayList<String> alldairyNames = new ArrayList<>();
        for (String dairyProducts : dairy) {
            alldairyNames.add(dairyProducts);

        }
        System.out.println(alldairyNames);
    }

    //    Create the method to print the Chips.(do it with the list, think about the reason why )
    public void printChips() {
        ArrayList<String> allchipsName = new ArrayList<>();
        for (String chipsProduct : chips) {
            allchipsName.add(chipsProduct);
        }
        System.out.println(allchipsName);
    }
//    Create the method to print the Cookies (do it with the list, think about the reason why)
    public void printCookies(){
    ArrayList <String> cookiesProduct= new ArrayList<>(); // creating the ArrayList
    for(String allcookiesProduct:cookies){// to put array to arrayList creating S
        cookiesProduct.add(allcookiesProduct);
    }
        System.out.println(cookiesProduct);
    }

        //TASK 3:
        //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )
//    public void printDairyPrice(){
//        ArrayList
//    }



//    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )


//    Create the method to print the CookiesPrice (do it with the list, think about the reason why )


        //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )


//    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )


//    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )

        //TASK 5:
        // Do all Task4 in a same method


        //TASK 6:

        //Create a method with the parameter String nameofItem and find the price of the product ?


        //Create a method with the parameter String nameofItem and replace it from the map


}
