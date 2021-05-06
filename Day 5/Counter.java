import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {
    static int ct = 0;

    static ReentrantLock lock = new ReentrantLock(true);

    static void incrementCounter(){
        lock.lock();

        try{
            counter++;
        }finally{
            lock.unlock();
        }
    }

    @Override
    public void run() {
        while(counter<50){
            incrementCounter();
        }
    }

    public static void main(String[] args) {
        Counter conter = new Counter();
        Thread gate1 = new Thread(conter);
        Thread gate2 = new Thread(conter;
        Thread gate3 = new Thread(conter);

        gate1.start();
        gate2.start();
        gate3.start();
    }
}