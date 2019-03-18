public class Animal {
    private String nume;
    private int greutate;
    protected int varsta;
    
    public Animal() {
        this("Max", 10);
    }
    
    public Animal(String nume, int greutate) {
        this.nume = nume;
        this.greutate = greutate;
        System.out.println("c-tor Animal");
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public void setNume(String nume) {
        if (nume == null) {
            return;
        }
        this.nume = nume;
    }
    
    public int getGreutate() {
        return this.greutate;
    }
    
    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    
    public void sayHello() {
        System.out.println("Buna, numele meu este " + nume);
    }
    
    
    
    
}