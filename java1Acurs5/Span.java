public class Span extends Personaj {
    @Override
    void actioneaza() {
        
        System.out.println("Ma voi da drept Harap-Alb");
    }
    
    @Override
    boolean isGood() {
        return false;
    }
}