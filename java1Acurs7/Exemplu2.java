public class Exemplu2 {
    public static void main(String [] args) {
        String s = new String("Hello");
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        s = sb.toString();
        s = s.toUpperCase();
        
        System.out.println(s);
    }
}