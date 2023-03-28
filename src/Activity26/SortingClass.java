package Activity26;

import java.util.Scanner;

public class SortingClass {
    private Scanner scanner;

    public SortingClass() {
        scanner = new Scanner(System.in);
    }

    public int[] getArray() {
        System.out.print("Enter 5 unsorted integers: ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int[] sortArray(int[] array) {
        // Insertion Sort Algorithm
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
