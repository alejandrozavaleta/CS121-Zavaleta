package Activity35;
import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private int ID;
    private String major;
    private String classStanding;
    private double gpa;
    private LinkedList<String> courseList;

    public Student(String firstName, String lastName, int ID, String major, String classStanding) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = 0.0;
        this.courseList = new LinkedList<>();
    }

    public void addCourse(String course) {
        this.courseList.add(course);
    }

    public void removeCourse(String course) {
        this.courseList.remove(course);
    }

    public String getStudentInfo() {
        return "Name: " + this.firstName + " " + this.lastName + "\nID: " + this.ID +
                "\nMajor: " + this.major + "\nClass Standing: " + this.classStanding +
                "\nGPA: " + this.gpa;
    }

    public void displayStudentCourses() {
        System.out.println("Course List:");
        for (String course : this.courseList) {
            System.out.println(course);
        }
    }
}

