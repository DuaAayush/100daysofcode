//Stack implementation in java:
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Popping elements from the stack
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        // Peeking at the top element of the stack
        int top = stack.peek();
        System.out.println("Top element: " + top);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
