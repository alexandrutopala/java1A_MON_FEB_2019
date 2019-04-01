public class Exemplu3 {
    public static void main(String [] args) {
        try (DBConnection con1 = new DBConnection();
             DBConnection con2 = new DBConnection()) {
               
             throw new Exception("IN TRY");     
        } catch (Exception e) {
            System.out.println("In catch");
            System.out.println(e.getMessage());
            Throwable[] ts = e.getSuppressed();
            for (Throwable t : ts) {
                System.out.println(t.getMessage());
            }
        }
        System.out.println("end main");
    }
}