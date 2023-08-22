public class hello {
    public static void main(String[] args) {
        // Revisiting Algorithms
        int[] arr = {5, 2, 8, 1, 7};
        System.out.println("Original Array: " + arrayToString(arr));
        bubbleSort(arr.clone());
        selectionSort(arr.clone());

        // Revisiting Coding Patterns
        int n = 5;
        printNumberPattern(n);
        printStarPattern(n);

        // Revisiting Concepts
        String topic = "Recursion";
        System.out.println("Let's revisit the concept of " + topic);
    }

    // Algorithm: Bubble Sort
    public static void bubbleSort(int[] arr) {
        // Implementation here...
        System.out.println("Bubble Sort: " + arrayToString(arr));
    }

    // Algorithm: Selection Sort
    public static void selectionSort(int[] arr) {
        // Implementation here...
        System.out.println("Selection Sort: " + arrayToString(arr));
    }

    // Pattern: Print Numbers
    public static void printNumberPattern(int n) {
        // Implementation here...
        System.out.println("Number Pattern:");
        // Print the pattern...
    }

    // Pattern: Print Stars
    public static void printStarPattern(int n) {
        // Implementation here...
        System.out.println("Star Pattern:");
        // Print the pattern...
    }

    // Helper method to convert an array to string
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}
