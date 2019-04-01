public class Exemplu4 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica("tom");
        Pisica p2 = new Pisica("mitzi");
        
        Pisica p3 = new Pisica("tom");
        Pisica p4 = p3;
        
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.equals(p3)); // true
        System.out.println(p2.equals(null)); // false
        System.out.println(p1 == p3); // false
        System.out.println(p4 == p3); // true
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        
        System.out.println(p1);
        
    }
}