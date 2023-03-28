package weekThree;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String player;
        System.out.println("Please pick a number between 1-100");
        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        //int counter = 1;
        //while (player != int_random){
        //System.out.println("Please pick a number between 1-100 but type 'q' if you want to end the game");
        //course = Scan
        //if (player )
        while (true) {

            System.out.println("Type 'q' if you want to end the game");
            player = console.nextLine();
            if (player.equals("q") || Integer.valueOf(player) == int_random) {
                System.out.println("Good one, genius.");
                break;
            } if (Integer.valueOf(player) < int_random) {
                System.out.println("wrong, pick a different number");
                System.out.println("Guess higher, numbnuts.");

                } if (Integer.valueOf(player) > int_random) {
                    System.out.println("wrong, pick a different number");
                    System.out.println("Guess lower, numbnuts.");
            }
            }


    }
}







