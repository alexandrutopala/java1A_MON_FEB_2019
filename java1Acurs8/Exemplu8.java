import java.util.*;

public class Exemplu8 {
    public static void main(String [] args) {
        Comparator<Angajat> comp = new Comparator<Angajat>() {
            @Override
            public int compare(Angajat a1, Angajat a2) {
                return a1.nume.compareTo(a2.nume);
            }
        };
        
        Set<Angajat> angajati = new TreeSet<>(comp);
        
        angajati.add(new Angajat("Gigel", 25, 4000));
        angajati.add(new Angajat("Costel", 28, 6000));
        angajati.add(new Angajat("Maria", 25, 5000));
        
        System.out.println(angajati);
    }
}