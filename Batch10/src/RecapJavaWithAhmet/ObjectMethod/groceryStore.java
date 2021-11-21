package RecapJavaWithAhmet.ObjectMethod;

public class groceryStore {

    int applesSoldYear;
    double applePrice;
    int orangesSoldYear;
    double priceOrange;

    public groceryStore() {
    }

    public void GrossRevenue(String city) {
        double revenue = (applePrice * applesSoldYear) + (orangesSoldYear * priceOrange);
        System.out.println(" Revenue of the All stores :" + revenue);

    }

    public double GrossRevenue1(String city) {
        double revenue = (applePrice * applesSoldYear) + (orangesSoldYear * priceOrange);
        return revenue;
    }

         public groceryStore(int applesSoldYear, double applePrice, int orangesSoldYear, double priceOrange) {
            this.applesSoldYear = applesSoldYear;
            this.applePrice = applePrice;
            this.orangesSoldYear = orangesSoldYear;
            this.priceOrange = priceOrange;

        }

    }




















    /*TASK 2
    Add additional code to the last exercise dealing with the groceryStore class
    Store values into the instance variables as follows:
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

