package weekThree;

import java.util.Scanner;

public class restaurantSelector {
    public static void main(String[] args) {
        // Initiate Scanner
        Scanner console = new Scanner(System.in);
        //Dietary Questions
        System.out.println("Is anyone in your party a vegetarian? y/n");
        String vegetarian = console.nextLine();
        System.out.println("Is anyone in your party a vegan? y/n");
        String vegan = console.nextLine();
        System.out.println("Is anyone in your party glutenfree? y/n");
        String glutenfree = console.nextLine();
        // here to make output look better
        System.out.println("Here are your restaurant choices:");

        // Actual conditional statements
        if (vegetarian.equals("y") && vegan.equals("y") && glutenfree.equals("y")) {
            System.out.println("The Chefs Kitchen");
            System.out.println("Corner Café");
        } if (vegetarian.equals("y") && vegan.equals("y")) {
            System.out.println("Main Street Pizza Company");
        } if (vegetarian.equals("y")) {
            System.out.println("Mama's Fine Italian");
        } else if (vegetarian.equals("n") && vegan.equals("n") && glutenfree.equals("n")) {
            System.out.println("Mama's Fine Italian");
        }

    }
}