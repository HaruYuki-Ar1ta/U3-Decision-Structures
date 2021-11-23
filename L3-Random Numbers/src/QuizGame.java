import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuizGame {


    static double usersAnswer, correctAnswer;
    static String display = "";

    static JPanel panel;
    static JButton createProblems, checkAnswer;
    static JLabel showProblems, results;
    static JTextField answerInput;
    static JRadioButton addition, subtraction, multiplication, division;
    static ButtonGroup radios = new ButtonGroup();

    public static void main(String[] args) {
      new QuizGame();

       /* create();
        getUserAnswer();
        check();*/

        System.out.println(correctAnswer + "\n" + display);

        }

        public QuizGame() {
            JFrame frame = new JFrame("Quiz Game");
            frame.setSize(450, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            panel = new JPanel();

            addition = new JRadioButton("Addition ");
            subtraction = new JRadioButton("Subtraction");
            multiplication = new JRadioButton("Multiplication");
            division = new JRadioButton("Division");
            createProblems = new JButton("Make problem");
            showProblems = new JLabel("PlaceHolder ");
            results = new JLabel("Results: ");
            answerInput = new JTextField(10);
            checkAnswer = new JButton("Check answer");

            addition.setBounds(50, 25, 150, 25);
            subtraction.setBounds(50, 50, 200, 25);
            multiplication.setBounds(50, 75, 200, 25);
            division.setBounds(50, 100, 200, 25);
            createProblems.setBounds(200, 25, 200, 25);
            showProblems.setBounds(50, 150, 200, 25);
            answerInput.setBounds(50, 175, 200, 25);
            checkAnswer.setBounds(50, 200, 200, 25);
            results.setBounds(50, 225, 200, 25);

            addition.setSelected(true);

            radios.add(addition);
            radios.add(subtraction);
            radios.add(multiplication);
            radios.add(division);

            createProblems.addActionListener(new NewProblemButton());
            checkAnswer.addActionListener(new CheckProb());

            panel.setLayout(null);
            panel.add(checkAnswer);
            panel.add(answerInput);
            panel.add(results);
            panel.add(showProblems);
            panel.add(createProblems);
            panel.add(addition);
            panel.add(subtraction);
            panel.add(multiplication);
            panel.add(division);


            frame.add(panel);
            frame.setVisible(true);


        }

        private class NewProblemButton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (addition.isSelected()) {
                    addition();
                }
                if (subtraction.isSelected()) {
                    subtraction();
                }
                if (multiplication.isSelected()) {
                    multiply();
                }
                if (division.isSelected()) {
                    division();
                }

                showProblems.setText(display);
                panel.remove(createProblems);
                panel.updateUI();

            }
        }
            private class CheckProb implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    getUserAnswer();
                    check();
                }
            }

        public static void getUserAnswer(){

        usersAnswer = Double.parseDouble(answerInput.getText());

        }
        public static void check(){
        if (usersAnswer == correctAnswer){
            results.setText("You are correct!");
            panel.add(createProblems);
            panel.updateUI();
        }else{
            results.setText("Incorrect");
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
