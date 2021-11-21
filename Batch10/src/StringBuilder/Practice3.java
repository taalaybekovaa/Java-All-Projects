package StringBuilder;

public class Practice3 {

    // Create a method that takes  String Builder array as a parameter
    //This method will replace middle chars of each word with '$' if the word has odd numbers of the letters
    // It will print out those words with their new versions
    //{"Efe","Seat","Sorin"}>> E$E

    public static void replace(StringBuilder [] word){
        StringBuilder stringBuilder= new StringBuilder();
        for (int i = 0; i < word.length ; i++) {
            if (word[i].length()%2!=0){                                      //next int number
                word[i].replace(word[i].length()/2,(word[i].length()/2)+1,"$");
                System.out.println(word[i]);
            }
        }
    }
    public static void main(String[] args) {
        StringBuilder [] builder ={new StringBuilder("David"), new StringBuilder("Josh"), new StringBuilder("Diana")};
        replace(builder);
    }

}
