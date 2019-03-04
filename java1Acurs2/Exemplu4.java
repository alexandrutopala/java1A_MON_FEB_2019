public class Exemplu4 {
    public static void main(String [] args) {
        Pisica p1;
        
        p1 = new Pisica();
        p1.nume = "Mitzi";
        p1.culoare = "roz";
        p1.varsta = 1;
        
        System.out.println(p1.nume);
        
        Pisica p2 = new Pisica();
        p2.nume = "Tom";
        p2.culoare = "portocaliu";
        p2.varsta = 13;
        
        Pisica p3 = p1;
        p3.nume = "Tommy";
        System.out.println(p1.nume);
        
        
        p3 = null;
        //System.out.println(p3.nume);
        
        p1.miau();
    }
}





