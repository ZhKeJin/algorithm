package concurrent;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import jihe.Arraylist;
import org.junit.Test;
import org.junit.experimental.max.CouldNotReadCoreException;
import sun.util.resources.th.CalendarData_th;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Zhangkj
 * @date 2019-11-02-21:31
 */
public class CollectionDemo {

    public static void main(String[] args) throws InterruptedException {


        int i=0;
        if(i!=0){
            throw new InterruptedException("asdfa");
        }


        try {
            System.out.println(10/0);

        } catch (Exception e){
            System.out.println("fasdf");
        }

        new HashMap<String,String>();
        new LinkedHashMap<String,String>();

        new Hashtable<String,String>();


        new ArrayList<String>();
        new LinkedList<String>();


        new Vector();
        new Stack<String>();

        new HashSet<String>();

        new LinkedHashSet<String>();

        new TreeMap<String,String >();

        new CopyOnWriteArrayList<String>();

        WeakHashMap<String, String> stringStringWeakHashMap = new WeakHashMap<>();

        ///////////////////////////////////////
//        AbstractQueuedSynchronizer;
//
//        ReentrantLock;
//
//        CyclicBarrier;
//
//
//        CountDownLatch;
//
//        ThreadLocal;
//
//        Thread;
//
//        Semaphore;
//
//        ThreadPoolExecutor;
//
//
//        ArrayBlockingQueue;
//
//        LinkedBlockingQueue;
//
//        PriorityBlockingQueue;
//        SynchronousQueue;
//
//
//        ConcurrentSkipListMap;
//
//        AtomicInteger;
//
//
//        Object;
//
//        String;
//        String a = new String("dasdf");

        ConcurrentHashMap;

        Object o = "a";

        System.out.println(o.hashCode());


//        Stack;
//        Queue;





    }
    @Test
    public  void main() {
        Collection set = new HashSet();
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);

        System.out.println(p1.equals(p2));
        set.add(p1);   //(1)
        set.add(p2);   //(2)
        set.add(p1);   //(3)

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + x;
//        result = prime * result + y;
//        return result;
//    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "x:" + x + ",y:" + y;
    }

}


