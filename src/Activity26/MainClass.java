package Activity26;

public class MainClass {
    public static void main(String[] args) {
        SortingClass sorting = new SortingClass();

        // get unsorted array from user
        int[] unsortedArray = sorting.getArray();

        // print unsorted array
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        // sort the array
        int[] sortedArray = sorting.sortArray(unsortedArray);

        // print sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}
