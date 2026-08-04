package collections.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        
        Map<Integer, String> map1 = new LinkedHashMap<>(map);
        map.remove(1);
        map.remove(2,"Two");
        
        
        System.out.println("Map after removing entries: " + map);
        System.out.println("LinkedHashMap after removing entries: " + map1);
        
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "Three");
        map2.put(1, "One");
        map2.put(4, "Four");
        map2.put(2, "Two");
        System.out.println("TreeMap: " + map2);
        Map.Entry<Integer, String> entry = map2.firstEntry();
        System.out.println("First entry: " + entry);
    }
}
