public class Exemplu3 {
    public static void main(String ... args) {
        String s = "ana are mere";
        
        s = s.replace(" ", "99");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        s = sb.toString();
        System.out.println(s);
        
        // erem99era99ana
    }
}