import java.util.*;

public class NumberKeeper {
    private static NumberKeeper singleton;
    private int number;
    
    private NumberKeeper() {
    }
    
    public static NumberKeeper getInstance() {
        if (singleton == null) {
            singleton = new NumberKeeper();
        }
        return singleton;
    }
    
    public void generate() {
        Random r = new Random();
        this.number = r.nextInt(90) + 10;
    }
    
    public boolean isGreaterThan(int value) {      
        if (this.number > value) {
            return true;
        } else {
            return false;
        }
        //return this.number > value;
    }
    
    public boolean isLessThan(int value) {
        return this.number < value;
    }
    
    public boolean isEven() {
        return this.number % 2 == 0;
    }
    
    public boolean isEqual(int value) {
        return this.number == value;
    }
    
    
    
    
    
    
}