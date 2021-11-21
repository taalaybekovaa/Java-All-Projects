package Blocks;

public class Practice {

    int number;
    static int id;


    {
        number=99;
        System.out.println("Instatnce Block");
    }


    static {
        id=25;
        System.out.println("Static Block");//bc belongs to the class we will se just once
    }


}
