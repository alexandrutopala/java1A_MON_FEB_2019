public class Stapan {
    private String nume;
    private Animal animal;
    
    public Stapan(String nume, Animal animal) {
        this.nume = nume;
        this.animal = animal;
    }
    
    public Animal getAnimal() {
        return this.animal;
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public boolean isPisica() {
        return (this.animal instanceof Pisica);
    }
    
    
    
}