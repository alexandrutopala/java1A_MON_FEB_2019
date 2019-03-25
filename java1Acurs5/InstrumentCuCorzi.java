@FunctionalInterface
public interface InstrumentCuCorzi 
            extends Instrument, Obiect {
                
    
    @Override
    default void canta() {
        System.out.println("la la la");
    }
    
    static void metodaStatica() {
        System.out.println("Metoda static in interfata");
    }
}