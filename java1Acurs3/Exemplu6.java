public class Exemplu6 {
    public static void main(String [] args) {
        int[] v1, v2;
        int v3[], v4;
        
        int[] v5[];
        int[] a1, a2[], a3[][][]; 
        // a1 : dim. 1
        // a2 : dim. 2
        // a3 : dim. 4
        
        
        System.out.println( suma(2, 2) );
        System.out.println( suma(1, 2, 3) );
        System.out.println( suma() );
        System.out.println( suma(new int[]{2, 2}) );
    }
    
    static int suma(int... nr) {
        int[] v = nr;
        int s = 0;
        for (int x : nr) {
            s += x;
        }
        return s;
    }
    
    
    
}