package weekTwo;

import java.util.Scanner;

public class Switchfunc {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter a Macronutrient");
        String macro= console.nextLine();
        // String planetInfo;

        switch (macro){

            case "Carbohydrate":
                System.out.println("Primary source of energy \n 4 Kcal per gram");
                break;
            case "Fat":
                System.out.println("Energy storage and promotes cell function \n 9 Kcal per gram");
                break;
            case "Protein":
                System.out.println("Builds and repairs muscle and other tissues \n 4 Kcal per gram");
                break;

        }

    }
}
