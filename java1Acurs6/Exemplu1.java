public class Exemplu1 {
    public static void main(String [] args) {
        System.out.println("A");
        
        try { // incearca sa executi tot ce este in try
            m(2);
            System.out.println("E");
        } catch (MyRuntimeException  | NullPointerException e) {
            
            System.out.println("D");
        } catch (MyException e) {
            // catch care poate trata exceptii de tipul MyException
            System.out.println("F");
            System.out.println(e.getMessage()); 
            e.printStackTrace();
        } finally { 
            // indiferent daca s-a aruncat vreo 
            // exceptie sau nu in try, executa ce
            // este in finally
            System.out.println("C");
        }
        
        System.out.println("B");
    }
    
    
    private static void m(int i) 
            throws MyRuntimeException, MyException {
        switch (i) {
            case 0: 
                MyRuntimeException e = new MyRuntimeException();
                throw e;
                //break;
            case 1: 
                throw new MyException();
            case 2: throw new NullPointerException("Pacaleala!!");
        }
    }
    
    
    
    
    
}