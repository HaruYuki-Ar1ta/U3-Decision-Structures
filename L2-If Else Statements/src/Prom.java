import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */

    public static void main(String[] args) {
        double money = Double.parseDouble(JOptionPane.showInputDialog("How much money do you have?"));
        int grade = Integer.parseInt(JOptionPane.showInputDialog("what is your grade? (9, 10, 11, 12)"));
        int discipline = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had"));

        if (money >= 40){
            if (grade >= 11){
               if (discipline <= 0){
                   //
                        JOptionPane.showMessageDialog(null, "You can buy a ticket!");
               }else{
                   //
                   JOptionPane.showMessageDialog(null, "You can not get a ticket");
               }
            }else{
                //
                JOptionPane.showMessageDialog(null, "You can not get a ticket");
            }
        }else{
            //

            JOptionPane.showMessageDialog(null, "You can not get a ticket");
        }

    }
}
