public class EvenNumbersRunnable implements Runnable {
    @Override
    public void run() {
    
        for (int i = 2; i <= 26; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}