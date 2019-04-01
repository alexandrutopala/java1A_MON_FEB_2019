public class Pisica /*implicit: extends Object*/ {
    String nume;
    
    
    
    public Pisica(String nume) {
        this.nume = nume;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pisica)) {
            return false;
        }
        
        if (obj == null) {
            return false;
        }
        
        Pisica other = (Pisica) obj;
        
        return this.nume.equals(other.nume);
    }
    
    @Override
    public int hashCode() {
        return this.nume.hashCode() * 12 % 223_431;
        //Objects.hashCode(nume);
    }
    
    @Override
    public String toString() {
        return "Miau! Numele meu este " + this.nume;
    }
    
    
    
    
    
}