class RunnableClass implements Runnable {
    private Thread t;
    private String threadName;

    RunnableClass(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(10);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        RunnableClass r1 = new RunnableClass("Thread-1");
        r1.start();
        RunnableClass r2 = new RunnableClass("Thread-2");
        r2.start();
    }
}

