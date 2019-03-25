public enum Anotimp {
    PRIMAVARA(2),
    IARNA(1),    
    VARA(3),
    
    TOAMNA(4);
    
    int x;
    
    /* subinteles: private*/ Anotimp(int x) {
        this.x = x;
    }
    
    public void printX() {
        System.out.println(x);
    }
}

/*
 * public final class Anotimp() {
 *      private Anotimp() {
 *      }
 *      
 *      public static final Anotimp IARNA = new Anotimp();
 *      public static final Anotimp PRIMAVARA = new Anotimp();
 *      public static final Anotimp VARA = new Anotimp();
 *      public static final Anotimp TOAMNA = new Anotimp();
 *  
   }
 * 
 */