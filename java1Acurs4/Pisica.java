public class Pisica extends AnimalDomestic {   
    int varsta; // 3 - modificare de atribute (hiding field)
    
    
    Pisica() {
        super(true);
        System.out.println("c-tor Pisica");
        super.varsta = 1;
        this.varsta = 3;
        // super - instanta clasei mostenite
    }
    
    void showSuperVarsta() {
        System.out.println(super.varsta);
    }
    
    void showThisVarsta() {
        System.out.println(this.varsta);
    }
    
    @Override
    public void sayHello() {
        System.out.println("Miau, numele meu este " + getNume());
    }
    
    
    
    
}