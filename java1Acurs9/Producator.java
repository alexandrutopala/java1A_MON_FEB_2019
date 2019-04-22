public class Producator extends Thread {
    
    public Producator(String threadName) {
        
        super(threadName);
    }
    
    @Override
    public void run() {
        java.util.Random r = new java.util.Random();
        
        while (true) {
            synchronized (Exemplu2.resursa) {
                if (Exemplu2.resursa.size() < 100) {
                    int x = r.nextInt(1000);
                    System.out.println("PRODUS: " + x);
                    Exemplu2.resursa.add(x);
                    Exemplu2.resursa.notifyAll();
                } else {
                    try {
                        Exemplu2.resursa.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
    
    
}