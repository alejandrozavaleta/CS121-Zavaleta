package weekTwo;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Variables
        String username = ("alex");
        Integer password = 123;

        //ui
        System.out.println("what is your username?");
        String ui = console.nextLine();

        System.out.println("what is your password");
        int ui2 = console.nextInt();

        if (ui.equals(username) && (ui2 == password)) {
            System.out.println("Welcome to CS121!");

        } else if (ui != (username) && (ui2 == password || ui.equals(username) && ui2 != (password))) {
            System.out.println("Either the username or password is wrong; please try again.");
        } else {
            System.out.println("Wrong username");
        }
    }
}
