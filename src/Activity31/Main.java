package Activity31;

    public class Main {
        public static void main(String[] args) {
            Student student1 = new Student("John", "Doe", 12345, "Computer Science", "Freshman");
            student1.addCourse("Intro to Programming");
            student1.addCourse("Calculus I");
            student1.addCourse("English Composition");
            student1.addCourse("Physics I");
            System.out.println(student1.getStudentInfo());
            student1.displayStudentCourses();
            student1.removeCourse("English Composition");
            System.out.println("After removing one course:");
            student1.displayStudentCourses();

            Student student2 = new Student("Jane", "Smith", 67890, "Biology", "Sophomore");
            student2.addCourse("Cell Biology");
            student2.addCourse("Organic Chemistry");
            student2.addCourse("Spanish I");
            System.out.println("\n" + student2.getStudentInfo());
            student2.displayStudentCourses();
            student2.removeCourse("Spanish I");
            System.out.println("After removing one course:");
            student2.displayStudentCourses();
        }
    }
