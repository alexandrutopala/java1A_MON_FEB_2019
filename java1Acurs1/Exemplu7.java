public class Exemplu7 {
    public static void main(String [] args) {
        int x = 6;
        
        if (x > 7) {
            System.out.println("x este mai mare decat 7");
        } else {
            System.out.println("in else");
        }     
        System.out.println(x);
        
        int a = x - 5 >= 0 ? 5 : -1;
        System.out.println(a);
        
        if (x - 5 >= 0) {
            a = 5;
        } else {
            a = -1;
        }
        
        
        
        
    }
}