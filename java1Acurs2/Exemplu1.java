public class Exemplu1 {
    public static void main(String [] args) {
        int i = 0;
        
        
        while (i < 5) {
            if (i == 2) {
                i++;
                continue;
            }
            
            if (i == 3) {
                break;
            }
            
            System.out.println(i);
            i++;
        }
    }
}