import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Validation {

    /*
    Let's create a simple program that validates
    a user's input.

    Let's say a user must enter a number greater than 10.
     */

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Pls enter a number greater than 10."));
        if (number >= 10) {
            JOptionPane.showMessageDialog(null, "correct!");

        }else{
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }
    }

}
