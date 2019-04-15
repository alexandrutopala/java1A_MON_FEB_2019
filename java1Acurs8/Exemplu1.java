public class Exemplu1 {
    public static void main(String [] args) {
        Cutie c1 = new Cutie();
        
        Cutie<String> c2 = new Cutie<String>();
        // c2 poate retine doar instante de cutie care 
        // au ca tip generic obligatoriu String
        
        Cutie<?> c3 = new Cutie<Integer>();
        // c3 poate retine doar instante de cutie care 
        // pot avea orice tip generic
        
        Cutie<? extends Number> c4 = new Cutie<Integer>();
        // c4 poate retine doar instante de cutie care 
        // au ca tip generic orice clasa care mosteneste 
        // Number
        
        Cutie<? super Number> c5 = new Cutie<Number>();
        // c5 poate retine doar instante de cutie care 
        // au ca tip generic orice clasa superioara lui 
        // Number        
        new Cutie< Cutie<Long> >();
        
        new Cutie<int[]>();
        
        
        Cutie<String> c6 = new Cutie<>();
        
        
        
        
        
        
    }
}