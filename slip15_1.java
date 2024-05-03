public class DisplayThreadNameAndPriority {
    public static void main(String[] args) {
        // Get the current thread
        Thread thread = Thread.currentThread();

        // Get the name of the thread
        String threadName = thread.getName();

        // Get the priority of the thread
        int threadPriority = thread.getPriority();

        // Display the name and priority of the thread
        System.out.println("Thread name: " + threadName);
        System.out.println("Thread priority: " + threadPriority);
    }
}
