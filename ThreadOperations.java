class RunnableDemo implements Runnable {
    public Thread t;
    private String threadName;
    boolean suspended = false;

    RunnableDemo (String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(20);
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName  + " exiting.");
    }
    
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    void suspend() {
        suspended = true;
    }

    synchronized void resume() {
        suspended = false;
        notify();
    }
}

public class ThreadOperations {
    public static void main(String[] args) {
        var r1 = new RunnableDemo("Thread-1");
        r1.start();

        // two
        var r2 = new RunnableDemo("Thread-2");
        r2.start();

        try {
            Thread.sleep(1000);
            r1.suspend();
            System.out.println("Suspending First Thread");

            Thread.sleep(1000);
            r1.resume();
            System.out.println("Resuming First Thread");

            r2.suspend();
            System.out.println("Suspending Second Thread");
            Thread.sleep(1000);

            r2.resume();
            System.out.println("Resuming Second Thread");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        try {
            System.out.println("Waiting for threads to finish.");
            r1.t.join();
            r2.t.join();
        } catch (InterruptedException exx) {
            exx.printStackTrace();
        }
        System.out.println("Main thread exiting.");
    }
}

