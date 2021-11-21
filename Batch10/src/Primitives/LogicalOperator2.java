package Primitives;

public class LogicalOperator2 {

    public static void main(String[] args) {

        //There is an event for kids
        // they must be 5 or older, 12 or younger than 12;
        //The other req is their height needs to be 46 or more than 46
        // The other requirement is their height to be 46 or more than 46 Inches to be able to attend

        int kidsAge=12;
        int kidsHeight=56;

        int minAge=5;
        int maxAge=12;

        int heightReq=46;

        boolean CanKidGo=(kidsAge>=minAge && kidsAge<=maxAge) && kidsHeight>=heightReq;
        System.out.println(CanKidGo);






    }
}
