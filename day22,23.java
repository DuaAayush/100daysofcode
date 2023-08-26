import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class JavaPractice {
    public static void main(String[] args) {
        // Practice data structures
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        Set<String> set = new HashSet<>();
        set.add("dog");
        set.add("cat");
        set.add("bird");
        // Practice algorithms
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int target = 10;
        System.out.println("Pair with sum " + target + ": " + findPairWithSum(arr, target));

        String text = "Hello, world! This is a text.";
        System.out.println("Word frequency: " + countWordFrequency(text));
        // Practice file handling
        try {
            File file = new File("data.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a text file.");
            writer.close();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("File contents:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Practice multithreading
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("All tasks completed.");
    }

    // Algorithm: Find pair with sum in an array
    public static boolean findPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // Algorithm: Count word frequency in a text
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = text.split("\\W+");
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
}

// Multithreading: Worker thread implementation
class WorkerThread implements Runnable {
    private String task;

    public WorkerThread(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " started.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(task + " completed.");
    }
}
