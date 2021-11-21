package Variables;

public class Practice2 {

    public static void main (String []args){

        int apples = 10;

        int oranges = 20;

        int kiwi = 30;

        System.out.println (oranges);
        System.out.println (kiwi);

        System.out.println("Total number of fruits = "+apples+oranges+kiwi);// Total numbers of fruits =102030
        System.out.println("Total number of fruits = "+(apples+oranges+kiwi));//This will show correct addition correct result

        System.out.println (apples+oranges+ " is total of apples and oranges");

        //in one line print the total  number of apples and kiwis is <..> and difference between kiwi and orange is <..>

        System.out.println("Total number of apples and kiwis is "+(apples+kiwi) + " and difference between kiwi and orange is "+(kiwi-oranges));


    }
}
