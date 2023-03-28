package weekSeven;

import java.util.Scanner;

public class arrayFromInput {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);

        String[] model = new String[5];
        String[] make = new String[5];
        int[] year = new int[5];

        for (int i = 0; i < 5; i++){

            System.out.println("Car model:");
            model[i] = console.nextLine();
            System.out.println("Car make:");
            make[i] = console.nextLine();
            System.out.println("car year:");
            year[i] = Integer.parseInt(console.nextLine());
            System.out.println();
        }
        System.out.printf("%-14s %s\n", "model","year");

        for (int i = 0; i < model.length; i++){

            System.out.printf("%-14s %s\n",model[i] + " " + make[i], year[i]);
        }
        console.close();
    }

}
