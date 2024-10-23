import java.util.HashMap;

public class HashMapExample{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insert key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Retrieve value by key
        System.out.println("Key 2: " + map.get(2));  // Output: Two

        // Remove an entry by key
        map.remove(3);

        // Check if a key exists
        System.out.println("Contains key 3: " + map.containsKey(3));  // Output: false

        // Iterate over map
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
