public class Exemplu3 {
    public static void main(String [] args) {
        int[] v1 = {7, -1, 5, 6, 10};
        
        
        System.out.println(v1[2]);
        v1[0] = -2;
        System.out.println(v1.length);
        
        for (int i = 0; i < v1.length; i++) {
            int x = v1[i];
            System.out.println(i + " : " + v1[i]);
        }
        
        for (int x : v1) {
            System.out.println(x);
        }
        
        int[] v2;
        v2 = new int[]{3, 2, -1};
        
        int[] v3 = new int[4];
        
        
        
    }
}