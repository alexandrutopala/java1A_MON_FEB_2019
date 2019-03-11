public class Exemplu2 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica();
        new Pisica();
        
        Pisica p2 = new Pisica();
        
        System.out.println(p1.nrInstante);
        System.out.println(p2.nrInstante);
        System.out.println(Pisica.nrInstante);
        p1.m();
        Pisica.m();
    }
}