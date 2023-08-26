import java.util.Arrays;

public class RecursionPractice {
    public static void main(String[] args) {
        // 1 Fibonacci Sequence
        int n = 10;
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // 2 Factorial
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        // 3 Sum of Array Elements
        int[] arr = {2, 5, 8, 1, 3};
        System.out.println("Sum of array elements: " + sumOfArray(arr));

        // 4 Exponentiation
        int x = 2;
        int exponent = 5;
        System.out.println(x + " raised to the power of " + exponent + " is: " + power(x, exponent));

        // 5 Palindrome Check
        String str = "radar";
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str));

        // 6 GCD (Greatest Common Divisor)
        int a = 48;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));

        // 7 Subset Sum
        int[] set = {3, 34, 4, 12, 5, 2};
        int targetSum = 9;
        System.out.println("Does a subset with sum " + targetSum + " exist? " + hasSubsetSum(set, targetSum));

        // 8 Tower of Hanoi
        int numOfDisks = 3;
        System.out.println("\nSteps to solve Towers of Hanoi with " + numOfDisks + " disks:");
        solveTowersOfHanoi(numOfDisks, 'A', 'C', 'B');

        // 9 Generate Permutations
        String inputStr = "abc";
        System.out.println("\nPermutations of \"" + inputStr + "\":");
        generatePermutations(inputStr, "");

        // 10 Binary Search
        int[] sortedArr = {1, 3, 5, 7, 9, 11};
        int targetElement = 7;
        System.out.println("Index of " + targetElement + " in the array: " + binarySearch(sortedArr, targetElement));
    }

    // 1 Fibonacci Sequence
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 2. Factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 3. Sum of Array Elements
    public static int sumOfArray(int[] arr) {
        return sumOfArrayRecursive(arr, arr.length - 1);
    }

    private static int sumOfArrayRecursive(int[] arr, int index) {
        if (index == 0) {
            return arr[index];
        } else {
            return arr[index] + sumOfArrayRecursive(arr, index - 1);
        }
    }

    // 4. Exponentiation
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    // 5. Palindrome Check
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        if (left >= right) {
            return true;
        } else {
            return str.charAt(left) == str.charAt(right) && isPalindrome(str.substring(left + 1, right));
        }
    }

    // 6. GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // 7. Subset Sum
    public static boolean hasSubsetSum(int[] set, int targetSum) {
        return hasSubsetSumRecursive(set, set.length - 1, targetSum);
    }

    private static boolean hasSubsetSumRecursive(int[] set, int index, int targetSum) {
        if (targetSum == 0) {
            return true;
        } else if (index < 0) {
            return false;
        } else if (set[index] > targetSum) {
            return hasSubsetSumRecursive(set, index - 1, targetSum);
        } else {
            return
