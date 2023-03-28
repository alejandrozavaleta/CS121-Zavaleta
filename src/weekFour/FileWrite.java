package weekFour;


import javax.swing.*;
import javax.swing.table.TableStringConverter;
import java.io.*;


public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile= new File("input.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String numbers;
        String abc;

        output.printf("%s %s \n","numbers", "abc");

        for(int i=1; i<=2; i++){
            numbers= JOptionPane.showInputDialog(String.format("Enter 1 number"));
            abc= JOptionPane.showInputDialog(String.format("Enter 1 letter"));

            output.printf("%s %s\n", numbers,abc);

        }
        output.close();


    }
}
