public class Exemplu1 {
    public static void main(String [] args) {
        Personaj p = createPersonaj();
        
        p.actioneaza();
    }
    
    static Personaj createPersonaj() {
        // metoda dintr-o biblioteca de pe net        
        return new Span();
    }
}