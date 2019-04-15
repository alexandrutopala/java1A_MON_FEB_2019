public class Angajat implements Comparable<Angajat> {
    String nume;
    int varsta;
    int salariu;
    
    public Angajat(String nume, int varsta, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
    }
    
    @Override
    public int compareTo(Angajat other) {
        return this.varsta - other.varsta;
    }
    
    
    
    @Override
    public String toString() {
        return nume + " " + varsta + " " + salariu;
    }
}




