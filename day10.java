public class StringExample {
    public static void main(String[] args) {
        // Creating and initializing strings
        String message = "Hello, World!";
        String name = "John";

        String greeting = "Welcome, " + name + "! " + message;
        System.out.println(greeting);

        int length = message.length();
        System.out.println("Length of message: " + length);


        char firstChar = message.charAt(0);
        char lastChar = message.charAt(message.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);


        String substring = message.substring(7, 12);
        System.out.println("Substring: " + substring);


        boolean isEqual = message.equals("Hello, World!");
        boolean contains = message.contains("World");
        System.out.println("Is equal: " + isEqual);
        System.out.println("Contains 'World': " + contains);

        String uppercase = message.toUpperCase();
        String lowercase = name.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
    }
}
