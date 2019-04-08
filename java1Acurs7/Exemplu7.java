import java.util.*;

public class Exemplu7 {
    
    public static void main(String [] args) {
        Random r = new Random();
        
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10)); // [0, 10)
        System.out.println(r.nextInt(15) - 10);
        
        
        
        
    }
}