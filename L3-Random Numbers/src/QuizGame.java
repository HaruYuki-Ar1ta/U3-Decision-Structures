import javax.swing.*;
import java.util.Random;

public class QuizGame {


    static double usersAnswer, correctAnswer;
    static String display = "";

    JPanel panel;
    JButton createProblems, checkAnswer;
    JLabel showProblems, results;
    JTextField answerInput;
    JRadioButton addition, subtraction, multiplication, division;
    ButtonGroup radios = new ButtonGroup();

    public static void main(String[] args) {
      new QuizGame();

       /* create();
        getUserAnswer();
        check();*/

        System.out.println(correctAnswer + "\n" + display);

        }

        public QuizGame() {
            JFrame frame = new JFrame("Quiz Game");
            frame.setSize(300, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            panel = new JPanel();

            addition = new JRadioButton("Addition ");
            subtraction = new JRadioButton("Subtraction");
            multiplication = new JRadioButton("Multiplication");
            division = new JRadioButton("Division");
            createProblems = new JButton("Make problem");
            showProblems = new JLabel(" ");
            results = new JLabel(" ");
            answerInput = new JTextField(10);
            checkAnswer = new JButton("Check answer");

            addition.setBounds(50, 25, 200, 25);
            subtraction.setBounds(50, 50, 200, 25);
            multiplication.setBounds(50, 75, 200, 25);
            division.setBounds(50, 100, 200, 25);

            radios.add(addition);
            radios.add(subtraction);
            radios.add(multiplication);
            radios.add(division);

            panel.setLayout(null);
            panel.add(addition);
            panel.add(subtraction);
            panel.add(multiplication);
            panel.add(division);


            frame.add(panel);
            frame.setVisible(true);


        }


        public static void getUserAnswer(){

        usersAnswer = input(" ");

        }
        public static void check(){
        if (usersAnswer == correctAnswer){
            JOptionPane.showMessageDialog(null, "You are correct");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect, try again");
        }

        }
    public static void create() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose: Addition(1), Subtraction(2), Multiply(3), or Division(4)"));

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

        correctAnswer = Math.round(correctAnswer * 100.0) / 100.0;
        display = num1 + " / " + num2;

    }


        //HELPER METHODS
    public static int random(){
        Random random = new Random();

        return random.nextInt(20) + 1;
    }
    public static double input(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

}
