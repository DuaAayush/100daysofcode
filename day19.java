import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Arrays.sort(arr);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class SortingStrings {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "grapes", "watermelon"};
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        System.out.println("Sorted array of strings in descending order based on length: " + Arrays.toString(words));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}

public class SortingObjects {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 30));

        Collections.sort(people);
        System.out.println("Sorted list of people based on age: " + people);
    }
}
