package Array;

public class TAsk3 {
    public static void main(String[] args) {

        String[] colors={" Red", "Yellow", " Brown","Blue", "White",
                "Orange", "Green", "Pink", "Violet", "Black","12","43","aAbc","aABc"};

       /* Print out every element in reverse order*/

        for(String c:colors) {
            String reverse= "";

        for(int i=c.length()-1; i>=0;i--) {
            reverse = reverse+c.charAt(i);

        }
            System.out.print(reverse+",");
        }

    }


}
