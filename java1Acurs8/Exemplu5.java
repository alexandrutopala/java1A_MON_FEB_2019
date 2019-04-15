import java.util.*;

public class Exemplu5 {
    public static void main(String [] args) {
        
        Set<String> set = new HashSet<>();
        
        set.add("Timisoara");
        set.add("Brasov");
        set.add("Sibiu");
        set.add("Bucuresti");
        set.add("Brasov");
        
        System.out.println(set);
        
        List<Integer> list = Arrays.asList(3, 5, 2, 6, 2, 3);
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        System.out.println(uniqueSet);
        
    }
}
