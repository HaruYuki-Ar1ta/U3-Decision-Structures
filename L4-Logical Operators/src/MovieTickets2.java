public class MovieTickets2 {

    /*
    The local Movie Theater has the following price structure:

    All movies after 5pm on Friday and Saturday are $10.00
    All movies after 5pm on Mon, Tues, Wed, Thurs and Sunday are $8.00
    All movies before 5pm on any day are $7.00.

    Children receive half off of all tickets.
    Senior Citizens receive half off on any movie before 5 pm.

    Create a program that will allow a user to enter the number of child, adult, and senior citizen tickets, the day
    and the time of their movie and accurately display the total ticket cost.


     */

    static int day;
    static double time;
    static double ticketPrice;
    static int ageGroup;


    public static void main(String[] args) {


    }
    public static void ticketPrice(){
        if (time >= 17 && (day == 5 || day == 6)){
            ticketPrice = 10.00;

        }

    }

}
