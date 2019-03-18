public class Exemplu1 {
    public static void main(String [] args) {
        Animal a = new Animal("Rex", 21);
        
        
        //a.nume = null; // instanta malefica
        a.setNume(null);
        
        System.out.println(a.getNume());
    }
}