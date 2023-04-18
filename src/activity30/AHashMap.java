package activity30;

import java.util.HashMap;
import java.util.Map;

public class AHashMap {
    private Map<String, String> map;

    public AHashMap() {
        this.map = new HashMap<>();
    }

    public void add(String key, String value) {
        this.map.put(key, value);
    }

    public void remove(String key) {
        this.map.remove(key);
    }

    public String get(String key) {
        return this.map.get(key);
    }

    public void display() {
        for (Map.Entry<String, String> entry : this.map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
