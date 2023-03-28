package weekSix;

public class testClass {
    public static void main(String[] args) {
        classesAct car1 = new classesAct("Civic","2018","Honda");

        System.out.printf("Name: %s%n", car1.Model);
        System.out.printf("Year: %s%n", car1.Year);
        System.out.printf("Manufacturer: %s%n", car1.Manufacturer);

        car1.getCarInfo();

    }
}
