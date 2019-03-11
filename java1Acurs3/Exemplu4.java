public class Exemplu4 {
    public static void main(String [] args) {
        int[] v = {1, -2, 7, 5};
        
        int s = 0;
        
        for (int x : v) {
            s += x; // s = s + x;
        }
        
        System.out.println(s);
    }
}