public class Bautura {
    public String nume;
    public int pret;
    
    
    public Bautura(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret;
    }
    
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Bautura)) {
            return false;
        }
        
        final Bautura b = (Bautura) other;
        
        return this.nume.equals(b.nume);
    }
    
    @Override
    public int hashCode() {
        return this.nume.hashCode();
    }
    
}


