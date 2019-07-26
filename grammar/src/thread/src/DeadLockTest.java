package thread.src;

import java.util.concurrent.locks.Lock;

/**
 * @author Zhangkj
 * @date 2019-05-20-15:27
 */

class LockDemo implements Runnable{

    private boolean flag;

    public LockDemo(boolean flag) {
        this.flag = flag;
    }

    public LockDemo() {

    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.la){
                System.out.println("if.....la");
                synchronized (MyLock.lb){
                    System.out.println("if...lb");
                }
            }

        }else{

            synchronized (MyLock.lb){
            System.out.println("else.....lb");
            synchronized (MyLock.la){
                System.out.println("else...la");
            }
          }

        }
    }
}

class MyLock{
    static Object la = new Object();
    static Object lb = new Object();

}



public class DeadLockTest {

    public static void main(String[] args) {
        LockDemo lockDemo = new LockDemo(true);
        LockDemo lockDemo1 = new LockDemo(false);


        new Thread(lockDemo).start();
        new Thread(lockDemo1).start();

    }


}
