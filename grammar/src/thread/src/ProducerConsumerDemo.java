package thread.src;

import com.sun.org.apache.regexp.internal.RE;
import sun.applet.Main;

/**
 * @author Zhangkj
 * @date 2019-05-20-17:15
 */
class Resources{

    private boolean flag = false;
    private String name;
    private int count = 1;

    public synchronized void set(String name){

        while(flag)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         this.name = name+"...."+count++;
         System.out.println(Thread.currentThread()+"生产者............"+this.name);
            flag = true;
            notifyAll();

    }

    public synchronized void out(){
        while(!flag)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread()+"消费者...."+name);
        flag = false;
        notifyAll();

    }
}

class Producer implements Runnable{

    private Resources resources;

    public Producer(Resources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        while(true){
            resources.set("商品...");
        }
    }
}

class Consumer implements Runnable{

    private Resources resources;

    public Consumer(Resources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        while(true){
            resources.out();
        }
    }

}


/**
 * 实现多个生产者 和  多个消费者 进行
 */
public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Resources resources = new Resources();

        new Thread(new Producer(resources)).start();
        new Thread(new Producer(resources)).start();
        new Thread(new Consumer(resources)).start();
        new Thread(new Consumer(resources)).start();
    }


}
