package weekOne;
import javax.swing.*;
import java.util.Scanner;

public class scanneranddialog {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstname = (JOptionPane.showInputDialog("Please type your first name:"));
        System.out.println("Please type your last name:");
        String lastname = console.nextLine();

        String name = firstname + " " + lastname;
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        StringBuilder reversedName = new StringBuilder(name);
        System.out.println(reversedName.reverse());
    }
}
