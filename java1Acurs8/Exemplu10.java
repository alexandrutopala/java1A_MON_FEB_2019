import java.util.*;

public class Exemplu10 {
    public static void main(String [] args) {
        Consumator c1 = x -> System.out.println(x);
        
        c1.consuma(5);
        
        Predicat p1 = x -> x % 2 == 0;
        
        System.out.println(p1.test(2));
        System.out.println(p1.test(3));
        
        List<Integer> list = Arrays.asList(4, 2, 3, 10, 7, 6, 4);
        
        list.forEach(x -> System.out.println(x));
        
        list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(x -> System.out.println(x));
        
    }
}

