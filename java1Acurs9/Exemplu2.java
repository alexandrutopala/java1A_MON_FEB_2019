import java.util.*;

public class Exemplu2 {
    
    public static List<Integer> resursa = new ArrayList<>(); 
    
    public static void main(String [] args) {
        new Consumator("c1").start();
        new Consumator("c2").start();
        new Consumator("c3").start();
        
        new Producator("p1").start();
        new Producator("p2").start();
        new Producator("p3").start();
        
    }
}