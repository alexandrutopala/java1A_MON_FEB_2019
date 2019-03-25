public class Exemplu3 {
    public static void main(String [] args) {
        // instantiere clasa inner statica (B2 din B)
        B.B2 b2;
        
        b2 = new B.B2();
        
        // instantiere clasa inner non-statica (B1 din B)
        B.B1 b1;
        B b = new B();
        
        b1 = b.new B1();
        B.B1 b12 = new B().new B1();
        
        
    }
}