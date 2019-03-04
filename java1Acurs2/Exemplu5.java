public class Exemplu5 {
    public static void main(String [] args) {
        Foo f = new Foo();
        
        int s = f.suma(2, 3);
        System.out.println(s);
        
        Pisica p = new Pisica();
        p.varsta = 15;
        int x = 21;
        
        f.transferCopie(x);
        f.transferReferinta(p);
        
        System.out.println(x);
        System.out.println(p.varsta);
        
        System.out.println( f.suma(3.2f, 1.4f) );
        System.out.println( f.suma(2, 2) );
        
        
    }
}