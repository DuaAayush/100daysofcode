public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 12, 1, 6};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Bubble Sort
        bubbleSort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            
            if (!swapped) {
                break;
            }
        }
    }
}
