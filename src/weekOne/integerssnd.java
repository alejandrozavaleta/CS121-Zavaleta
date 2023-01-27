package weekOne;
import java.util.Scanner;
import javax.swing.*;

public class integerssnd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double firstnumber = (Double.valueOf(JOptionPane.showInputDialog("Please type a number")));
        System.out.println("Please type another number");
        Double secondnumber = (Double.valueOf(console.nextLine()));
        System.out.println(firstnumber + secondnumber);
        System.out.println(firstnumber - secondnumber);
        System.out.println(firstnumber * secondnumber);
        System.out.println(firstnumber / secondnumber);
        System.out.println(java.lang.Math.sqrt(firstnumber));
        System.out.println(java.lang.Math.sqrt(secondnumber));
        System.out.println(java.lang.Math.pow(secondnumber,firstnumber));
        System.out.println(java.lang.Math.log(firstnumber));
        System.out.println(java.lang.Math.log(secondnumber));
    }
}
