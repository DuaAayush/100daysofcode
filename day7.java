public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = Factorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
