public class ThreadPriorityExample extends Thread {
    public void run() {
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args) {
        // Creating threads with the help of ThreadPriorityExample class
        ThreadPriorityExample th1 = new ThreadPriorityExample();
        ThreadPriorityExample th2 = new ThreadPriorityExample();
        ThreadPriorityExample th3 = new ThreadPriorityExample();

        // Getting the name of the current thread
        String threadName = Thread.currentThread().getName();

        // Getting the priority of the current thread
        int threadPriority = Thread.currentThread().getPriority();

        // Displaying the name and priority of the current thread
        System.out.println("Current thread name: " + threadName);
        System.out.println("Current thread priority: " + threadPriority);

        // Setting the priority of th1 thread to the maximum priority
        th1.setPriority(Thread.MAX_PRIORITY);

        // Getting the priority of th1 thread
        int th1Priority = th1.getPriority();

        // Displaying the priority of th1 thread
        System.out.println("Priority of th1 thread: " + th1Priority);

        // Starting the threads
        th1.start();
        th2.start();
        th3.start();
    }
}
