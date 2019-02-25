public class Exemplu9 {
    public static void main(String [] args) {
        int x = 8;
        
        switch (x) {
            case 1 : System.out.println("Este luni"); break;
            case 2 : System.out.println("Este marti"); break;
            case 3 : System.out.println("Este miercuri"); break;
            case 4 : System.out.println("Este joi"); break;
            case 5 : System.out.println("Este vineri"); break;
            case 6 : 
            case 7 : System.out.println("weekend"); break;
            default : System.out.println("invalid");
        }
    }
}