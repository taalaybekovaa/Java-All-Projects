package String;

public class Method1 {

    public static void main(String[] args) {

        String city="Chicago";
        city.concat("is very cold");//It's not gonna show up because we did not reassign the value.
        // String is immutable which means the original value is not change unless you reassign
        System.out.println(city);

        String newCity=city.concat("is very beautiful");
        System.out.println(city);
        System.out.println(newCity);

        System.out.println(newCity.length());

        int letterCount=newCity.length();
        System.out.println(letterCount);

        city.charAt(0);//It will going to return 1 letter f thr words //C
        city.charAt(3);
        System.out.println(city.charAt(3));
        city.charAt(6);//If we will put number 9 it will show us error and will
        // not show us even the sentence and not gonna work
        System.out.println("It is almost time to go ");
    }
}
