public class RecursionExamples {
    public static void main(String[] args) {
        // Fibonacci Sequence
        int n = 10;
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Factorial
        int number = 5;
        System.out.println("\nFactorial of " + number + " is: " + factorial(number));

        // Towers of Hanoi
        int numOfDisks = 3;
        System.out.println("\nSteps to solve Towers of Hanoi with " + numOfDisks + " disks:");
        solveTowersOfHanoi(numOfDisks, 'A', 'C', 'B');
    }

    // Fibonacci Sequence using recursion
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Towers of Hanoi using recursion
    public static void solveTowersOfHanoi(int numOfDisks, char source, char destination, char auxiliary) {
        if (numOfDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveTowersOfHanoi(numOfDisks - 1, source, auxiliary, destination);
        System.out.println("Move disk " + numOfDisks + " from " + source + " to " + destination);
        solveTowersOfHanoi(numOfDisks - 1, auxiliary, destination, source);
    }
}
