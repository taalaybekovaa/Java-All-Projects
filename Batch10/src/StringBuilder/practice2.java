package StringBuilder;

public class practice2 {

    /*  create a method that will take String as a parameter
        this method will delete '-' (dashes) given string
        use delete/deleteCharAt() method to solve (StringBuilder object)
        print final version of string/stringbuilder object with no dashes
        "I-n-t-e-r-v-i-e-w" >> Interview */

    public static void main(String[] args) {
        String str= "I-n-t-e-r-v--i-e--w";
        deleteDashes(str);
    }


    public static void deleteDashes(String string){
       StringBuilder sb= new StringBuilder(string);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='-'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);

    }
}
