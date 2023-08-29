import java.util.*;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println("List: " + list);

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(5); // Duplicates are automatically removed in a Set
        System.out.println("Set: " + set);

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Map: " + map);

        // Using Collections utility class
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        System.out.println("Original List: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}
