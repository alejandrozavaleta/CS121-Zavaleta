package weekTwo;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter one measurement of a side of a triangle:");
        Integer side1 = console.nextInt();
        System.out.println("Please enter side 2 of the triangle:");
        Integer side2 = console.nextInt();
        System.out.println("Please enter side 3:");
        Integer side3 = console.nextInt();

        if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("Its an Equilateral Triangle!");
        } else if (side1 != side2 && side2 != side3 && side1 != side3) {
            System.out.println("It's a Scalene Triangle");
        } else {
            System.out.println("Its an Iscoseles Triangle");
        }
    }
}
