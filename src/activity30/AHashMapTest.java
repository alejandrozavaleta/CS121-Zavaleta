package activity30;

public class AHashMapTest {
    public static void main(String[] args) {
        AHashMap map = new AHashMap();

        // add at least 3 key/value pairs
        map.add("apple", "red");
        map.add("banana", "yellow");
        map.add("grape", "purple");

        // display all key/value pairs
        System.out.println("All key/value pairs:");
        map.display();

        // remove one key/value pair
        map.remove("banana");

        // display all key/value pairs again
        System.out.println("All key/value pairs after removing banana:");
        map.display();
    }
}
