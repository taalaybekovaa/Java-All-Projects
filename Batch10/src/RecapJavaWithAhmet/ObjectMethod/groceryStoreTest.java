package RecapJavaWithAhmet.ObjectMethod;

public class groceryStoreTest {

    public groceryStoreTest() {
    }

    public static void main(String[] args) {

        /*
        For the Houston Store:
    number of apple sold per year=534
    retail price of each apple=0.99
    number of oranges sold per year=429
    retail price of each orange=0.87

    For the Seattle Store:
    number of apples sold per year =765
    retail price of each apple=0.86
    number of oranges sold per year=842
    retail price of each orange=0.91 */

        groceryStore   houstonSt = new groceryStore();
        groceryStore   seattleStore = new groceryStore();

        houstonSt.applesSoldYear=534;
        houstonSt.applePrice=0.99;
        houstonSt.orangesSoldYear=429;
        houstonSt.priceOrange=0.87;

        seattleStore.applesSoldYear=765;
        seattleStore.applePrice=0.86;
        seattleStore.orangesSoldYear=842;
        seattleStore.priceOrange=0.91;

        System.out.println("Apple sold yeraly:"+houstonSt.applesSoldYear);
        System.out.println("Apple retail cost :"+houstonSt.applePrice);
        System.out.println(" Oranges sold yearly:  "+ houstonSt.orangesSoldYear);
        System.out.println("  Orange retail cost" +houstonSt.priceOrange);


        System.out.println("Orange sold yeraly:"+seattleStore.orangesSoldYear);
        System.out.println("Orange retail cost :"+seattleStore.priceOrange);
        System.out.println(" Apples sold yearly:  "+ seattleStore.orangesSoldYear);
        System.out.println("  Apples  retail cost" +seattleStore.priceOrange);

        houstonSt.GrossRevenue("huston");
        seattleStore.GrossRevenue("seattle");



        double value2=houstonSt.GrossRevenue1("huston");
        double value3=seattleStore.GrossRevenue1("seattle");

    }
}
