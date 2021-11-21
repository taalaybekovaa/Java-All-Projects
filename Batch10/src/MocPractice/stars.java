package MocPractice;

public class stars {

    public static void main(String[] args) {
        // How to print christmas tree
        // Steps:

        int height=10;
        // 1. Set height for out tree
        for (int i=1;i<=height ;i++){
            //2. Creating loop for spaces before star (indentation). Doing to print 10-1=9 times space and then going down till 1
            for (int space = 1; space <=height-i ; space++) {
                System.out.print(" ");
            } //3. Creating loop for stars. And setting star <=i*2-1  i-is 1.outupt is 1. And than it's going to increase stars by 2
             for (int star = 1; star <=i*2-1; star++) {
                 System.out.print("*");
            }
            System.out.println();
        }



    }
}