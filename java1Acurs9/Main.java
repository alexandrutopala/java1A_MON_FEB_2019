import java.util.*;

public class Main {
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        Cafenea cafenea = Cafenea.getInstance();
        String line;
        String [] input;
        
        while (true) {
            try {
                line = scanner.nextLine();
                input = line.split("\\s+");
                
                switch (input[0].toUpperCase()) {
                    case "ADD" : adaugaBautura(input); break;
                    case "AFIS" : cafenea.afiseazaBauturi(); break;
                    case "AFIS_CAFELE" : cafenea.afiseazaCafele(); break;
                    case "STERGE" : cafenea.stergeBautura(input[1]); break;
                    case "SORT" : cafenea.sorteazaBauturi(); break;
                    case "EXIT" : System.exit(0); break;
                    default : System.err.println("Comanda invalida");
                }
                
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
    }
    
    
    private static void adaugaBautura(String[] input) {
        String tipBautura = input[1];
        String nume = input[2];
        int pret = Integer.parseInt(input[3]);
        int inf = Integer.parseInt(input[4]);
        
        if (tipBautura.equals("suc")) {
            Cafenea.getInstance().adaugaBautura(
                new Suc(nume, pret, inf)
            );
        } else if (tipBautura.equals("cafea")) {
            Cafenea.getInstance().adaugaBautura(
                new Cafea(nume, pret, inf)
            );
        }
    }
    
    
}