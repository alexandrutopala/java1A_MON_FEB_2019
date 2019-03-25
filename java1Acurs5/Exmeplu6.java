public class Exmeplu6 {
    public static void main(String [] args) {
        Masina logan = Masina.getInstance();
        logan.marca = "Dacia";
        
        Masina X5 = Masina.getInstance();
        X5.marca = "BMW";
        
        System.out.println(logan.marca);
        
    }
}