import javax.swing.*;
import java.util.Random;

public class QuizGame {


    static int usersAnswer, correctAnswer;
    static String display = "";

    public static void main(String[] args) {
        int choice = input("Choose: Addition(1), Subtraction(2), Multiply(3), or Division(4)");
            create(choice);

        }

        System.out.println(correctAnswer + "\n" + display);
    }

    public static void create(int choice) {
        if (choice >= 1) {

            if (choice < 5) {

                if (choice == 1) {
                    addition();
                }
                if (choice == 2) {
                    subtraction();
                }
                if (choice == 3) {
                    multiply();
                }
                if (choice == 4) {
                    division();
                }

            } else {
                System.out.println("Wrong input, RESTART");
                System.exit(0);
            }
        } else {
            System.out.println("Wrong input, RESTART");
            System.exit(0);
        }
    }
    public static void addition(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 + num2;
        display = num1 + " + " + num2;

    }
    public static void subtraction(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 - num2;
        display = num1 + " - " + num2;
    }
    public static void multiply(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 * num2;
        display = num1 + " * " + num2;

    }
    public static void division(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 / num2;
        display = num1 + " / " + num2;
    }


        //HELPER METHODS
    public static int random(){
        Random random = new Random();

        return random.nextInt(20) + 1;
    }
    public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

}
