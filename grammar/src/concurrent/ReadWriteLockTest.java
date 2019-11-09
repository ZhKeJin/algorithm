package concurrent;

/**
 * @author Zhangkj
 * @date 2019-10-02-21:16
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock readLock = lock.readLock();
    private Lock writeLock = lock.writeLock();

    public void read() {
        try {
            readLock.lock();
            try {
                System.out.println("获得读锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(1000);
            } finally {
                readLock.unlock();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void write() {
        try {
            writeLock.lock();
            try {
                System.out.println("获得写锁 " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(1000);
            } finally {
                writeLock.unlock();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();

        Thread a = new Thread(()->{
            readWriteLockTest.read();
        }, "t-A");

        Thread b = new Thread(()->{
            readWriteLockTest.write();
        }, "t-B");

        a.start();
        b.start();
    }

}

