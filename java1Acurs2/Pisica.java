public class Pisica {
    String nume;
    String culoare;
    
    int varsta;
    
    Pisica() {
        this("Mitzi", "alb", 3);
        // acesta este un c-tor fara parametrii
        System.out.println("c-tor pisica");
    }
    
    Pisica(String nume, String culoare, int varsta) {
       
        // c-tor al clasei pisica, care primeste 3 param.
        System.out.println(nume); // Tom
        System.out.println(this.nume); // null
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    
    void miau() {
        System.out.println("mesaj");
        if (1 == 1) return;
        
        System.out.println("Miau! Numele meu este " + this.nume);
        return;
    }
}