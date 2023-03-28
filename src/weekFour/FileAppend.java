package weekFour;


import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileAppend {
    public static void main(String[] args) throws IOException{
        try {
            FileWriter fileWriter = new FileWriter("input.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String numbers = JOptionPane.showInputDialog("Enter 1 Number");
            String abc = JOptionPane.showInputDialog("Enter 1 Letter");

            output.printf("%s %s", numbers, abc);
            fileWriter.close();
            output.close();
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
        }

    }
}
