public class Exemplu5 {
    public static void main(String [] args) {
        boolean b1 = true;
        
        boolean b2 = false;
        boolean b3 = !b2;
        boolean b4 = b1 || !b2 && b3;
        System.out.println(b4);
        
        int a = 5;
        a *= 2 + 3;
        System.out.println(a);
        
        a++;
        System.out.println(a);
        
        int x = a++ + ++a - --a + 5;
        System.out.println(x);
        
        
        
    }
}