public class Exmeplu4 {
    public static void main(String [] args) {
        Integer i1 = new Integer(3);
        
        int x = 5;
        Integer i2 = new Integer(x);
        
        System.out.println(i1 + i2);
        Integer i3 = i1 / i2;
        Object o1 = i1;
        
        int y = i3.intValue();
        System.out.println(y);
        
    }
}