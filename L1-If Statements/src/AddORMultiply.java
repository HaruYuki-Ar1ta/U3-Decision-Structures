import javax.swing.JOptionPane;


public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.
     */

    public static void main (String[] args){
    int x = Integer.parseInt(JOptionPane.showInputDialog("What is your first number?"));
    int y = Integer.parseInt(JOptionPane.showInputDialog("What is the second number?"));
        if (x > y){
            int product = multiply(x, y);
            JOptionPane.showMessageDialog(null, "The product of your numbers are: " + product);
        }
        if (x < y){
            int sum = addition(x, y);
            JOptionPane.showMessageDialog(null, "The sum of your numbers is: " + sum);
        }
    }
    public static int addition(int x, int y){
        return x + y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
}
