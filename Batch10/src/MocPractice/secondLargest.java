package MocPractice;

public class secondLargest {

    public static void main(String[] args) {

    int[] array = {12 ,13 ,15 ,12 ,0};

    int lN= 0;
    int sLN=0;

for (int i = 0; i < array.length; i++) {
        for (int j = i+1; j < array.length; j++) {
            if (array[j] > array[i]) {
                lN=array[j];
                sLN=array[i];
            }
        }
    }
System.out.println(sLN+" "+lN);
}
}