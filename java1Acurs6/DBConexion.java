public class DBConexion implements AutoCloseable
{ public DBConexion(){
   System.out.println("Cream o conexiune...");
  }
  @Override
  public void close(){
      System.out.println("Inchidem conexiunea...");
    }
}
