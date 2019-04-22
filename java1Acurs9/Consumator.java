public class Consumator extends Thread {
    public Consumator(String threadName) {
        super(threadName);
    }
    
    @Override
    public void run() {
        while (true) {
            synchronized (Exemplu2.resursa) {
                if (!Exemplu2.resursa.isEmpty()) {
                    int x = Exemplu2.resursa.get(0);
                    System.out.println("CONSUMAT: " + x);
                    Exemplu2.resursa.remove(0);
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