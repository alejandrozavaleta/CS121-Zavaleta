package Activity28;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the StudentSet program!");
        System.out.println("Creating a new set of students.");
        StudentSet studentSet = new StudentSet();
        System.out.println("Adding students to the set.");
        studentSet.addStudents();
        System.out.println("Displaying the students in the set.");
        studentSet.displayStudents();
        System.out.println("Thank you for using the StudentSet program!");
    }
}
