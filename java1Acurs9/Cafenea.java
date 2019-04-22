import java.util.*;

public class Cafenea {
    
    private Map<String, Bautura> bauturi = new HashMap<>();
    private static final Cafenea SINGLETON = new Cafenea(); 
    
    private Cafenea() {
    }
    
    public static Cafenea getInstance() {
        return SINGLETON;
    }
    
    public void adaugaBautura(Bautura b) {
        if (bauturi.keySet().contains(b.nume)) {
            throw new NameAlreadyExistsException();
        }
        bauturi.put(b.nume, b);
    }
    
    public void afiseazaBauturi() {  
        bauturi.forEach((k, v) -> System.out.println(v));
    }
    
    public void afiseazaCafele() {
        bauturi.forEach((k, v) -> {
            if (v instanceof Cafea) {
                System.out.println(v);
            }
        });
    }
    
    public void stergeBautura(String nume) {
        bauturi.remove(nume);
    }
    
    public void sorteazaBauturi() {
        Comparator<Bautura> comp = (b1, b2) -> b1.pret - b2.pret;
        Collection<Bautura> c = bauturi.values();
        List<Bautura> list = new ArrayList<>(c);
        
        Collections.sort(list, comp);
        
        list.forEach(b -> System.out.println(b));
    }
    
    
    
    
    
    
    
}