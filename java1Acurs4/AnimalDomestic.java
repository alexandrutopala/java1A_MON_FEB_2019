public class AnimalDomestic extends Animal {
    private boolean deInterior; // 1. adaugare de atribute
    
    public AnimalDomestic(boolean deInterior) {
        this.deInterior = deInterior;
        System.out.println("c-tor AnimalDomestic");
    }
    
    public boolean isDeInterior() { // 2. adaugare de comportamente
        return deInterior;
    }
    
    public void setDeInterior(boolean deInterior) {
        this.deInterior = deInterior;
    }
}