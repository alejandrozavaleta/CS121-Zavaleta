package projects;

import java.util.Random;
import java.util.Scanner;

public class projectOne {

    public static void main(String[] args) {
//variables
        int player1Wins = 0;
        int player2Wins = 0;


        Scanner console = new Scanner(System.in);
        System.out.println("Please type an odd number of rounds to play:");
        int oddRounds = console.nextInt();



        for (int i = 1; i <= oddRounds; i++) {
            System.out.println("Round: " + i);

            /// player 1


            System.out.println("Player one, How many health-points does your pokemon have?");
            int poke1Health = console.nextInt();

            System.out.println("How much power does your pokemon have?");
            int poke1Power = console.nextInt();
            System.out.println("How much speed does your pokemon have?");
            int poke1Speed = console.nextInt();

            System.out.println("Which move will your pokemon perform?");
            String poke1Move = console.nextLine();

            System.out.println("Player one, What is the name of your pokemon?");
            String poke1Name = console.nextLine();


            /// player 2


            System.out.println("Player two, How many health-points does your pokemon have?");
            int poke2Health = console.nextInt();

            System.out.println("How much power does your pokemon have?");
            int poke2Power = console.nextInt();
            System.out.println("How much speed does your pokemon have?");
            int poke2Speed = console.nextInt();
            System.out.println("Which move will your pokemon perform?");
            String poke2Move = console.nextLine();

            System.out.println("Player Two, What is the name of your pokemon?");
            String poke2Name = console.nextLine();

            if (poke1Health >= 0 || poke2Health >= 0) {
                if (poke2Speed > poke1Speed) {
                    poke1Health = poke1Health - poke2Power;
                }
                if (poke2Speed < poke1Speed) {
                    poke2Health = poke2Health - poke1Power;
                }
                if (poke2Speed == poke1Speed) {
                    Random rand = new Random();
                    int upperbound = 2;
                    int int_random = rand.nextInt(upperbound);
                    if (int_random == 2){
                        poke1Health = poke1Health - poke2Power;
                    }else{
                        poke2Health = poke2Health - poke1Power;
                    }

                }
            }
            if (poke1Health <= 0){
                System.out.println("Player 2 wins round " + i);
                player2Wins = player2Wins + 1;
            }
            if(poke2Health <=0) {
                System.out.println("Player 1 wins round " + i);
                player1Wins = player1Wins +1;
            }
              if (player2Wins < player1Wins){
                System.out.println("Player 1 wins! with "+ player1Wins + " rounds");
            }
            if (player2Wins > player1Wins){
                System.out.println("Player 2 wins! with "+ player2Wins + " rounds");
            }
        }
    }
}



            /*if (poke2Speed > poke1Speed){
                int p2 = poke1Health - poke2Power;
                if (poke1Health <= 0){
                    System.out.println("Player 2 is the round winner!");
                    player2Wins = player2Wins +1;
                }else{
                    int p1 = poke2 health - poke2
                }

            } if (poke2Speed < poke1Speed){

            } if (poke2Speed == poke1Speed);/*

        }
    }
}
}
}

             */