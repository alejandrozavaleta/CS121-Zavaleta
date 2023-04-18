package activity25;
import java.util.Scanner;
public class sortClass {
//Bubble/merge sort
        public int[] getArray() {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[5];
            System.out.println("Please enter 5 unsorted integers: \n Make sure to press enter after each entry.");
            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextInt();
            }
            return arr;
        }

        public int[] sortArray(int[] arr) {
            // Using bubble sort algorithm
            int n = arr.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (arr[j] > arr[j+1]) {

                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr;
        }

    }


