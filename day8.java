public class ComplexityExample {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        // Function to calculate the sum of an array
        int sum = calculateSum(array);

        System.out.println("Sum: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
