package ArrayPractice;

public class ArrayPractice3 {

    public static void main(String[] args) {

        int[] numbers = {4, 4, 5, 12, 6, 7, 12, 7, 1, 1, 2, 2, 3};
        String unique="";

        for (int i = 0; i < numbers.length; i++) { //check numbers{
            boolean isUnique=true;
            for(int k=0; k<i; k++){
                if(numbers[i]==numbers[k]){
                    isUnique=false;
                }
            }
            if(isUnique){
                unique+=numbers[i]+",";
            }
        }
        System.out.println(unique);
    }
}
