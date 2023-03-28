package weekFour;


import java.util.Scanner;
public class MethodsActivity {
    static Scanner console= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the length of a rectangle");
        int length= console.nextInt();
        System.out.println("Enter the Width of a rectangle");
        int width=console.nextInt();

        Integer area=length*width;

        System.out.printf("rectangle length: %s\n",length);
        System.out.printf("rectangle width: %s\n",width);
        System.out.printf("rectangle area: %s",area);
        




        console.close();

    }
}