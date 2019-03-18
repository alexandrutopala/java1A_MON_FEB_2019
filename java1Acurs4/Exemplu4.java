public class Exemplu4 {
    public static void main(String [] args) {
        
         
        Pisica p = new Pisica();
        AnimalDomestic ad = new Pisica();
        
        Animal a = new Pisica();
        
        Animal a1 = new AnimalDomestic(true);
        
        
        
        //Pisica p1 = (Pisica) a1; // ClassCastException
        //String s = (String) a1;
        
        //a = new Animal();
        
        if (a instanceof Pisica) {
            Pisica p3 = (Pisica) a;
        } else {
            System.out.println("a nu contine o instanta de Pisica");
        }
        
        //a.isDeInterior();
        a.sayHello();
        
        
        
        
        
        
    }
}