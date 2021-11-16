

import javax.swing.*;

public class ShippingCosts {

    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2lbs or less ..................... $1.10
    over 2lbs but less than 6lbs ..... $2.20
    over 6lbs but less than 10lbs .... $3.70
    over 10lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.
     */
    public static void main(String[] args) {
        int miles = Integer.parseInt(JOptionPane.showInputDialog("How many miles has the packaged been shipped?"));
        double weightInPounds = Double.parseDouble(JOptionPane.showInputDialog("How much does your item weigh?"));
        double rate;
        double cost;

        if (weightInPounds >= 10){
            rate = 4.80;
        }else{
            if (weightInPounds >= 6){
                rate = 3.70;

            }else{
                if (weightInPounds >= 2){
                    rate = 2.20;

                }else{
                    rate = 1.10;

                }

            }
        }

        cost = price(rate, miles);
        JOptionPane.showMessageDialog(null, "The cost is: " + cost);


    }


        public static double price (double rate, double miles) {
            int hundredMiles = (int) (miles /100);

            if (hundredMiles == 0){
                hundredMiles = 1;
            }
        return rate * hundredMiles;
    }
}