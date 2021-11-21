package Switch;

public class Practice2 {

    public static void main(String[] args) {
        String name="Zack";//"Zack".toUpperCase();Just in case if user going to write
        switch (name){
            default://It is going to show up if we going to look for Zuck instead of Luna
                System.out.println("Student is not here");
            break;
            case "Alex":
                System.out.println("Alex is here");
                break;
            case"David":
                System.out.println("David is here");
                break;
            //case "luna": //It is not matching because of the  lowe case
            case "Luna":
                System.out.println("Luna is here");
                break;


        }



    }
}
