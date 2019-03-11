public class Pisica {
    static int nrInstante;
    String nume;
    
    static {
        
        System.out.println("bloc anonim static");
    }
    
    {
        
        System.out.println("bloc anonim non-static");
    }
    
    Pisica() {
        System.out.println("c-tor pisica");
        nrInstante++;
    }
    
    void miau() { // context non-static (continutul unei metode non-statice)
        System.out.println("Miau" + nrInstante);
    }
    
    static void m() { // context static (continutul unei metode statice)
        // nu il pot folosi pe this in context static
        //System.out.println("Metoda statica" + this.nume);
    }
}




