import java.util.*;

public class Main {
    private static final int MAX = 15;
    private static int counter;
    private static int score;
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String [] input;
        NumberKeeper number = NumberKeeper.getInstance();
        int x;
        boolean rez;
        
        init();
        
        while (true) {
            line = scanner.nextLine();
            input = line.split("\\s+");
            
            switch (input[0].toUpperCase()) {
                case "GT":
                    x = Integer.parseInt(input[1]);
                    rez = number.isGreaterThan(x);
                    System.out.println(rez);
                    counter++;
                    break;
                case "LT" :
                    x = Integer.parseInt(input[1]);
                    rez = number.isLessThan(x);
                    System.out.println(rez);
                    counter++;
                    break;
                case "EQ" : 
                    x = Integer.parseInt(input[1]);
                    rez = number.isEqual(x);
                    if (rez) {
                        System.out.println("Ai castigat cu " + score);
                        init();                      
                    } else {
                        score -= 10;
                        if (score < 0) {
                            System.out.println("Mai incearca");
                            init();
                        } else {
                            System.out.println("Mai ai doar " + score + " puncte");   
                        }
                    }
                    break;
                case "EVEN" : 
                    System.out.println(number.isEven());
                    break;
                case "RESTART" : 
                    init();
                    break;
                case "EXIT" : 
                    System.exit(0);
                    break;
                default : System.err.println("Comanda invalida");
            }
            
            
        }
        
    }
    
    private static void init() {
        System.out.println("Ma gandesc la un numar de 2 cifre");
        score = 100;
        counter = 0;
        NumberKeeper.getInstance().generate();
    }
    
    
    
    
    
}