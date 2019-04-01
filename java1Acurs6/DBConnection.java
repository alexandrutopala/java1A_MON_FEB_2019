public class DBConnection implements AutoCloseable {
    public DBConnection() {
        System.out.println("Cream o conexiune...");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Inchidem conexiunea...");
        throw new Exception("Exceptie din conexiune");
    }
}