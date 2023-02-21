import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NeuThread extends Thread {

    private final Lock lock = new ReentrantLock();


    private int a;

    public NeuThread(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println(a += 100);
        } finally {
            lock.unlock();

        }
    }
}
