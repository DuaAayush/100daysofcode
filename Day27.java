import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Bubble Sort
        bubbleSort(arr.clone());

        // Selection Sort
        selectionSort(arr.clone());

        // Insertion Sort
        insertionSort(arr.clone());

        // Merge Sort
        mergeSort(arr.clone());

        // Quick Sort
        quickSort(arr.clone());
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        // Implementation here...
        System.out.println("Bubble Sort: " + Arrays.toString(arr));
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        // Implementation here...
        System.out.println("Selection Sort: " + Arrays.toString(arr));
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        // Implementation here...
        System.out.println("Insertion Sort: " + Arrays.toString(arr));
    }

    // Merge Sort
    public static void mergeSort(int[] arr) {
        // Implementation here...
        System.out.println("Merge Sort: " + Arrays.toString(arr));
    }

    // Quick Sort
    public static void quickSort(int[] arr) {
        // Implementation here...
        System.out.println("Quick Sort: " + Arrays.toString(arr));
    }
}
