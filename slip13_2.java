import java.util.Random;

public class ThreadLifecycle {

    private static final int MAX_SLEEP_TIME = 4999;

    private String threadName;

    public ThreadLifecycle(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        Random random = new Random();
        int sleepTime = random.nextInt(MAX_SLEEP_TIME);

        System.out.println("Thread " + threadName + " is sleeping for " + sleepTime + " milliseconds.");

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + threadName + " is awake.");
    }

    public static void main(String[] args) {
        ThreadLifecycle thread1 = new ThreadLifecycle("Thread 1");
        ThreadLifecycle thread2 = new ThreadLifecycle("Thread 2");

        thread1.start();
        thread2.start();
    }
}
