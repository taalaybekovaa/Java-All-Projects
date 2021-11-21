package Project4;

public class Task3 {

    public static void main(String[] args) {

        String name= "Snicker";
        String name1="Cookie";

        System.out.println(name.toUpperCase().substring(2,(name.length())).charAt(0));


        System.out.println(name1.toLowerCase().replace("o","u").concat("s").startsWith("C"));
    }
}
