public class Synchronization {

    private static int count = 0;

    public static void main(String[] args) {

        // Create two threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        // Start the threads
        t1.start();
        t2.start();

        // Wait for the threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of count
        System.out.println("Final value of count: " + count);
    }

    // Synchronized method to increment count
    public static synchronized void increment() {
        count++;
    }
}
