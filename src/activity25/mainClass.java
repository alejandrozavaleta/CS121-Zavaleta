package activity25;

public class mainClass {

        public static void main(String[] args) {
            sortClass sorting = new sortClass();

            // Get the unsorted array from the user
            int[] unsortedArray = sorting.getArray();

            // Print the unsorted array
            System.out.println("Unsorted array:");
            for (int i = 0; i < unsortedArray.length; i++) {
                System.out.print(unsortedArray[i] + " ");
            }
            System.out.println();

            // Sort the array and save the sorted array
            int[] sortedArray = sorting.sortArray(unsortedArray);

            // Print the sorted array
            System.out.println("Sorted array:");
            for (int i = 0; i < sortedArray.length; i++) {
                System.out.print(sortedArray[i] + " ");
            }
            System.out.println();
        }

    }

