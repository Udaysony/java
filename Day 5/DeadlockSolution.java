import java.lang.*;
import java.util.concurrent.locks.ReentrantLock;
public class DeadLockSolution
{

    public static void main(String[] args)
    {

        ReentrantLock l1 = new ReentrantLock();
        ReentrantLock l2 = new ReentrantLock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                synchronized (l1) {
                    System.out.println("Thread 1 - lock 1");

                    try { Thread.sleep(10); }
                    catch (InterruptedException e) {}
                    System.out.println("Thread 1 is waiting for lock 2");

                    synchronized (l2) {
                        System.out.println("Thread 1 - lock 1 and 2");
                    }
                }
            }
        });

        // Changed the order of lock

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                synchronized (l1) {
                    System.out.println("Thread 2 - lock 1");

                    try { Thread.sleep(10); }
                    catch (InterruptedException e) {}
                    System.out.println("Thread 2 is waiting for lock 2");

                    synchronized (l2) {
                        System.out.println("Thread 2 - lock 1 and 2");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}