public class Exemplu5 {
    public static void main(String [] args) {
        
        
        Integer i1 = 2; // new Integer(2); // boxing
        int x = i1; // i1.intValue(); // unboxing
        
        String s = "21";
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}