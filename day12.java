public class Str {
    public static void main(String[] args) {
      
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(", World!");
        System.out.println(sb); 

      
        sb.delete(5, 8);
        System.out.println(sb);

   
        sb.reverse();
        System.out.println(sb);

        sb.insert(6, " Java");
        System.out.println(sb); 

        sb.replace(0, 7, "Greetings");
        System.out.println(sb); 
    }
}


public class Str {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java", "Programming"};

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word).append(" ");
        }

        String result = sb.toString().trim();
        System.out.println(result); 
    }
}
