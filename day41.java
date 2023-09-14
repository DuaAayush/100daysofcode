import java.util.LinkedList;

class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class HashTable<K, V> {
    private static final int TABLE_SIZE = 10; // Size of the hash table
    private LinkedList<KeyValuePair<K, V>>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        return key.hashCode() % TABLE_SIZE;
    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> list = table[index];
        for (KeyValuePair<K, V> pair : list) {
            if (pair.getKey().equals(key)) {
                pair = new KeyValuePair<>(key, value); // Update the value if the key already exists
                return;
            }
        }
        list.add(new KeyValuePair<>(key, value));
    }

    public V get(K key) {
        int index = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> list = table[index];
        for (KeyValuePair<K, V> pair : list) {
            if (pair.getKey().equals(key)) {
                return pair.getValue(); // Return the value associated with the key
            }
        }
        return null; // Key not found
    }

    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        // Adding key-value pairs
        hashTable.put("John", 25);
        hashTable.put("Alice", 30);
        hashTable.put("Bob", 22);

        // Retrieving values
        System.out.println("John's age: " + hashTable.get("John"));
        System.out.println("Alice's age: " + hashTable.get("Alice"));
        System.out.println("Bob's age: " + hashTable.get("Bob"));
        System.out.println("Charlie's age: " + hashTable.get("Charlie")); // Key not found
    }
}
