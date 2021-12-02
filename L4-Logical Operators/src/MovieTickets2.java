import java.util.Locale;

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



    public static void main(String[] args) {
        int time = 20;
       int numChild, numAdult, numSenior;


        String day = "saturday";
        day = day.toLowerCase();

        double ticketPrice = ticketPrice(time, day);

        System.out.println(ticketPrice);
    }

        public static double ticketPrice(int time, String day){

        double ticketPrice = 0;

        if (time >= 17 && (day.equals("friday") || day.equals("saturday"))){
            ticketPrice = 10.00;

        }else if(time >= 17){
            ticketPrice = 8.00;
        }else{
            ticketPrice = 7.00;
        }
        return ticketPrice;
    }

    public static double findChildPrice(int time, String day) {
       double ticketPrice =0;
        if (time >= 17 && (day.equals("friday") || day.equals("saturday"))){
            ticketPrice = 10.00;

        }else if(time >= 17){
            ticketPrice = 8.00;
        }else{
            ticketPrice = 7.00;
        }
        return ticketPrice *= .50;
    }
    public static double findSeniorPrice(int time, String day){
            double ticketPrice = 0;
            if (time >= 17 && (day.equals("friday") || day.equals("saturday"))){
                ticketPrice = 10.00;

            }else if(time >= 17){
                ticketPrice = 8.00;
            }else{
                ticketPrice = 7.00;
            }
            return ticketPrice *= .50;
        }

    }


