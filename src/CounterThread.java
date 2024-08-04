
public class CounterThread {
    private static volatile boolean finishedCountingUp = false;

    public static void main(String[] args) {
        Thread upThread = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Thread 1 • Counting up: " + i);
            }
            finishedCountingUp = true;
        });

        Thread downThread = new Thread(() -> {
            while (!finishedCountingUp) {
              
            }

            for (int i = 20; i >= 0; i--) {
                System.out.println("Thread 2 • Counting down: " + i);
            }
        });

        upThread.start();
        downThread.start();
    }
}
