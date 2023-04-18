package Activity28;

import java.util.*;

public class StudentSet {
    private Set<String> students;

    public StudentSet() {
        students = new HashSet<String>();
    }

    public void addStudents() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("q")) {
            System.out.print("Enter a student name, or q to quit: ");
            input = scanner.nextLine();
            if (!input.equals("q")) {
                students.add(input);
            }
        }
    }

    public void displayStudents() {
        System.out.println("Student Set:");
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}