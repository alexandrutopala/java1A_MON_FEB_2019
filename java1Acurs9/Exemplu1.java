public class Exemplu1 {
    public static void main(String [] args) {
        OddNumbersThread t1 = new OddNumbersThread();
        
        Runnable task = new EvenNumbersRunnable();
        Thread t2 = new Thread(task);
        
        
        t1.start();
        t2.start();
        
        try {
            t1.join(); // pune firul curent sa astepte
                       // pana la terminarea firului t1
                       
            t2.join(); // pune firul curent sa astepte
                       // pana la terminarea firului t2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("end main");
    }
}