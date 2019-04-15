import java.util.*;

public class Exmeplu3 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(2);
        
        list.remove(new Integer(2));
        
        System.out.println(list);
    }
}