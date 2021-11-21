package Mentoring;

import java.util.ArrayList;

public class element {

//    ArrayList<String> name = new ArrayList<>();
//    name.add("Adam");
//    name.add("Altynai");
//    name.add("Bota");
//
//
//    public static void main(String[] args) {
//        searchElement(name,"Ahmet");
//    }


    public static void searchElement(ArrayList<String> allname,String name) {
        String searchElement=name;
        for (int i = 0; i < allname.size(); i++) {
            if (allname.get(i).equals("Ahmet")) {
                System.out.println("Your name is there");
                break;
            } else {
                System.out.println("Your name is not there ");
            }
        }
    }
}

