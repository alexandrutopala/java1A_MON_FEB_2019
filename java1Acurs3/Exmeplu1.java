public class Exmeplu1 {
    public static void main(String [] args) {
        Punct p1 = new Punct(2, 1);
        Punct p2 = new Punct(3, 14);
        
        Cerc c = new Cerc(new Punct(3, 2), 2);
        
        System.out.println(c.getArie());
        System.out.println(c.isInside(p1));
        System.out.println(c.isInside(p2));
    }
}