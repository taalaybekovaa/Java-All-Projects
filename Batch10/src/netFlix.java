public class netFlix {
    String accountName;
    String username;
    static double monthlyUsage=200;

    public double usage(double dataUsage) {

        return monthlyUsage=monthlyUsage-dataUsage;
}
    public static void main(String[] args) {
        netFlix user = new netFlix();
        user.accountName = "Home";
        user.username = "Leya";
        user.usage(12);
        System.out.println(user.monthlyUsage);
        System.out.println(user.accountName);



    }
    }