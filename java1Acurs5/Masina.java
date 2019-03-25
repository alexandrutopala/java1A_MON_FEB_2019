public class Masina {
    String marca;

    private static Masina singleton;
    
    private Masina() {
    }
    
    public final static Masina getInstance() {
        if (singleton == null) { 
            singleton = new Masina();
        }
        return singleton;
    }
}