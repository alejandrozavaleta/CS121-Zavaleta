package weekOne;

import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {
        System.out.println("You will be prompted to type 3 different scores to be evaluated.");
        Integer score1 = (Integer.valueOf(JOptionPane.showInputDialog("Please type the first score:")));
        Integer score2 = (Integer.valueOf(JOptionPane.showInputDialog("Please type the second score:")));
        Integer score3 = (Integer.valueOf(JOptionPane.showInputDialog("Please type the third score:")));
        Double combo = Double.valueOf((score3 + score2 + score1) / 3);
        System.out.println(combo);
        String grade = "";

        if(combo <= 100.0 && combo >=89.5){
            grade ="A";
        } else if (combo <= 89.4 && combo >=79.5){
            grade ="B";
        } else if (combo<= 79.4 && combo >=69.5){
            grade ="C";
        }else if (combo <= 69.4 && combo >= 59.5){
            grade ="D";
        }else{
            grade ="F";
        }
        System.out.println("grade :" + grade);

    }
}
