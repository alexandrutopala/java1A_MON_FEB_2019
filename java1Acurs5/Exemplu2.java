public class Exemplu2 {
    public static void main(String [] args) {
        Anotimp a = Anotimp.IARNA;
        
        switch (a) {
            case IARNA : System.out.println("e frig"); break;
            case PRIMAVARA : System.out.println("e e soare"); break;
            case VARA : System.out.println("e foarte cald"); break;
            case TOAMNA : System.out.println("ploua"); break;
        }
        
        System.out.println(a.name());
        System.out.println(a.ordinal());
        Anotimp[] anotimpuri = Anotimp.values(); // imi returneaza toate
                                // instantele din enum
                                
        Anotimp a1 = Anotimp.valueOf("VARA");
        System.out.println(a1.name());
        
        a1.printX();
        a1.x = 0;
        
    }
}