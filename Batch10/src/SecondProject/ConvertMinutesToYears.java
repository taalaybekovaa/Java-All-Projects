package SecondProject;

public class ConvertMinutesToYears {

    public static void main(String[] args) {

        long totalMinutes = 3456789l, onehourinmin = 60, onedayinhourd= 24, onedayinmin, yearinmin, year =365, totalYears, daysLeft;

        onedayinmin = onehourinmin * onedayinhourd;
        System.out.println(onedayinmin);

        yearinmin = onedayinmin * year;
        totalYears = totalMinutes / yearinmin;
        System.out.println(totalYears);
        daysLeft = totalMinutes%yearinmin;
        System.out.println(daysLeft);
        daysLeft = daysLeft/onedayinmin;
        System.out.println(daysLeft);
        System.out.println(totalMinutes + " minutes is approximately " + totalYears + " years and " + daysLeft +" days. ");

    }
}
