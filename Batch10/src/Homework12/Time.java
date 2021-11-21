package Homework12;

public class Time {

      /* Create a class with the name Time. The class needs to have 5
fields (instance variables) with the names hour, minute, second,
month, and year.
Write the following constructor:
1- Create the three-argument constructor to set the values for
hour, minutes, and second
2- Create a two-argument constructor to set the values for month
and year
3- Create five argument constructor to set the values for hour,
minutes, second, month, and year. */

    double hour;
    double minute;
    double second;
    int month;
    int year;

    public Time() {

    }

    public Time(double hour, double minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public Time(double hour, double minute, double second, int month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.year = year;

/*Create the following instance methods for the Time class:
1- Create one method named getHour. This method needs to return
the hour from the instance field.
2-  Create one method named getMinute. This method needs to return
the minute from the instance field.
3- Create one method named getSecond. This method needs to return
the second from the instance field.
4- Create one method named getMonth. This method needs to return
the Month from the instance field.
5- Create one method named getYear This method needs to return the
Year from the instance field*/
    }

    public double getHour() {
        return hour;
    }

    public double getMinute() {
        return minute;
    }

    public double getSecond() {
        return second;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;

    }

/* Create the following instance methods for the Time class:
1-  Create one method named setHour, it needs to set the value of the
hour field. If the value of the hour is less than 0 and more than equals
24, the value of the hour must set to 0.
2- Create one method named setMinute, it needs to set the value of
the minute field. If the value of the minute is less than 0 and more than
equals 60, the value of the minute must set to 0.
3- Create one method named setSecond, it needs to set the value of
the second field. If the value of the second is less than 0 and more
than equals 60, the value of the second must set to 0.
 */

    public double setHour(double hour) {
        if (hour < 0 && hour >= 24) {
            return 0;
        }
        return hour;
    }

    public double setMinute(double minute) {
        if (minute < 0 && minute >= 60) {
            return 0;
        }
        return minute;

    }

    public double setSeconds(double second) {
        if (second < 0 && second >= 60) {
            return 0;
        }
        return second;
    }

    public int setMonth(int month) {
        if (month < 0 && month >= 12) {
            return 0;
        }
        return month;
    }

    public int setYear(int year) {
        if (month < 0) {
            return 0;
        }
        return year;
    }

    public void getTime(double hour) {
        /*
        Create one method that will take one parameter as the hour
value, this method will print "am" or "pm" according to the hour.
If the hour is before 12, it will print am and after 12 it will print the
pm.
         */
        if (hour >= 1 && hour < 12) {
            System.out.println(hour + "AM");
        }
        if (hour > 12 && hour < 24) {
            System.out.println(hour + "PM");
        }
    }

    public String seasons(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";

            case 9:
            case 10:
            case 11:
                return "Fall";
            default:
                System.out.println("Invalid entry");
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        Time object = new Time();
        System.out.println(object.seasons(35));

    }

    /* Create the following instance methods for the Time class:
3- Create one printTime method to print Time information (Text
Format : hh/mm/ss)
4- Create one printDate method to print Date information (Text
format: mm/yyyy)
5- Create toString method to print all object(Time and Date
information) in giving format: hh/mm/ss - mm/yyyy)  */
    public void timeInfo(double hour, double minute, double second) {
        System.out.println("Text format: " + hour + "/" + minute + "/" + second);
    }

    public void dateInfo(int month, int year) {
        System.out.println("Text format: " + month + "/" + year);
    }

    @Override
    public String toString() {
        return "" + hour +
                "/" + minute +
                "/" + second +
                " - " + month +
                "/ " + year +
                '}';

    }

public void instruction (){

        System.out.println("press 1 to create Time\n" +
                "press 2 to create Date\n" +
                "press 3 to create a Date and time\n" +
                "press 4 to update Time\n" +
                "press 5 to update Date\n" +
                "press 6 to print Time information\n" +
                "press 7 to print Date information\n" +
                "press 8 to print Data and Time information\n" +
                "press 9 to exit");
    }
    }


