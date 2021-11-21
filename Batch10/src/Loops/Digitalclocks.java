package Loops;

public class Digitalclocks {

    public static void main(String[] args) {

        for (int a = 0; a < 2; a++) {
            if(a==0) {
                continue;
            }OUTER:
            for (int hours = 0; hours <= 12; hours++) {
                if (a == 0) {
                    if (hours == 5 && hours <= 7) {
                        continue;
                    }

                    if (hours >= 10) {
                        break OUTER;
                    }
                    for (int minutes = 0; minutes <= 60; minutes++) {
                        if (a == 0) {
                            System.out.println(hours + ":" + minutes + "am");

                        } else {
                            System.out.println(hours + ":" + minutes + "pm");
                        }
                    }

                    System.out.println();
                }

            }

        }
    }
}
