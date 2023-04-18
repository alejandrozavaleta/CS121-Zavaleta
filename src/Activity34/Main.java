package Activity34;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of calories allowed per day by the diet: ");
        int caloriesPerDay = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter the start date of the diet (mm/dd/yyyy): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter the end date of the diet (mm/dd/yyyy): ");
        String endDate = scanner.nextLine();

        TotalCalories totalCalories = new TotalCalories(caloriesPerDay, startDate, endDate);
        try {
            int total = totalCalories.calculateTotalCalories();
            System.out.println("Total calories consumed during the diet period: " + total);
        } catch (ParseException e) {
            System.out.println("Error: Invalid date format. Please enter dates in mm/dd/yyyy format.");
        }

        scanner.close();
    }
}