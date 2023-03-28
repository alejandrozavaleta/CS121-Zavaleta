package weekSeven;

public class arrayDemo3 {
    public static void main(String[] args) {

    String[][] array1 = {{"a","b","c"},{"d","e","f"}};

        for (int row = 0; row < array1.length; row++) {

            for (int column = 0; column < array1[row].length; column++)
            {
                System.out.printf("%s", array1[row][column]);
            }
            System.out.println();
            }
    }
}
