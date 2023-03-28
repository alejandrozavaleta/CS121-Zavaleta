package weekThree;

import java.util.Random;
import java.util.Scanner;

public class espGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();

        int number;
        int right= 0;
        String color = null;
        String guess;

        for (int i = 1; i <= 10; i++) {
            number = random.nextInt(5);
            if (number == 0)
                color = "red";
            if (number == 1)
                color = "green";
            if (number == 2)
                color = "blue";
            if (number == 3)
                color = "orange";
            if (number == 4)
                color = "yellow";
            System.out.println( i + ". What color do you think the computer chose?");
            guess = console.nextLine();
            if (guess.equalsIgnoreCase(color))
                 right = right + 1;
            System.out.println("The computer guessed: " + color);

        }
        System.out.println("You got " + right + " out of 10 correct");
    }
}
