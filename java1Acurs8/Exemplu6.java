import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
        
        Set<String> set = new LinkedHashSet<>();
        
        set.add("Timisoara");
        set.add("Brasov");
        set.add("Sibiu");
        set.add("Bucuresti");
        set.add("Brasov");
        
        System.out.println(set);
        
        
    }
}