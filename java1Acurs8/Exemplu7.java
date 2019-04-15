import java.util.*;

public class Exemplu7 {
    public static void main(String [] args) {
        Set<Integer> set = new TreeSet<>();
        
        set.add(5);
        set.add(2);
        set.add(-1);
        set.add(2);
        set.add(10);
        
        System.out.println(set);
    }
}