package weekSeven;

public class arrayDemo2 {
    public static void main(String[] args) {

    int[][] array1 = new int[4][3];
    array1[0][0] = 1;
    array1[0][1] = 2;
    array1[0][2] = 3;
    array1[1][0] = 4;
    array1[1][1] = 5;
    array1[1][2] = 6;
    array1[2][0] = 7;
    array1[2][1] = 8;
    array1[2][2] = 9;
    array1[3][0] = 1;
    array1[3][1] = 1;
    array1[3][2] = 1;

    for (int[] row : array1)
    {
        for (int column : row)
        {
            System.out.printf("%s", column);
        }
        System.out.println();
    }
    System.out.println();
}
}
