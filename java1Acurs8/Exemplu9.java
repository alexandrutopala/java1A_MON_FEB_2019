import java.util.*;

public class Exemplu9 {
    
    public static void main(String [] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Gigel", 25);
        map.put("Costel", 28);
        map.put("Maria", 26);
        
        Integer varsta = map.get("Maria");
        // Integer value = map.get(key);
        System.out.println(varsta);
        
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        
        System.out.println(map);
        
        map.put("Costel", 31);
        
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            
            System.out.println(key + " : " + value);
        }
        
        map.forEach((k, v) -> System.out.println(k + " " + v));
        
        
    }
}