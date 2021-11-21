package Switch;

public class Practice1 {

    public static void main(String[] args) {
        int number=25;
        switch (number) {//It is going to check and evaluate for number which is in number storage.
            // If the value on the second line we gonna see all lines after second line if there is no break
            case 3:
                System.out.println("First");
                break;//Is going to stop execution of that case. We won't see al the lines after case 3 if everywhere is break
            case 25:// You cannot have the same cases in same time, you need to use different names
                System.out.println("Second");
                break;
            case 5:
                System.out.println("Third");
                break;
            case 11:
                System.out.println("Fourth");//If there is no break we going to see default as well
                break;

            default:// None of cases matches-defolt is going to work. We can put this delault everywhere
                // it's not doesn't matter. Even if there is matching case we going to seee default as well iuf there is no break
                System.out.println("This is default");

        }
    }
}
