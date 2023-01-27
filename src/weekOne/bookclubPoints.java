package weekOne;

import javax.swing.*;

public class bookclubPoints {
    public static void main(String[] args) {
        Integer booksread = (Integer.valueOf(JOptionPane.showInputDialog("How many books have you bought from us this month?")));
        int points = 0;

        if(booksread== 0){
            points+=0;
        } else if (booksread== 1){
            points+=5;
        } else if (booksread== 2){
            points+=15;
        }else if (booksread== 3){
            points+=30;
        }else{
            points+=40;
        }
        System.out.println("points:" + points);
        }


    }

