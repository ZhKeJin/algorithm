package concurrent;

import jihe.Arraylist;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.*;
import java.util.zip.ZipOutputStream;

/**
 * @author Zhangkj
 * @date 2019-09-24-17:34
 */
public class Threadlocal {

    static ThreadLocal<Object> sdaf = new ThreadLocal<Object>();




    public static void main(String[] args) {


        System.out.println(5/2);
        AtomicLong atomicLong = new AtomicLong();

        Random random = new Random();

        System.out.println(random.nextInt(5));

//        LinkedList;
//
//        LockSupport lockSupport = new LockSupport();
//
//
//        AbstractQueuedSynchronizer;
////
//      ReentrantLock;
////
////        Condition;
////
//         ReentrantReadWriteLock;
////
////        ThreadPoolExecutor;
////
////        Object;
//        LinkedBlockingQueue;
//
//
//        ArrayBlockingQueue;
//
//        PriorityBlockingQueue;
//
//
//        DelayQueue;
//
//        SynchronousQueue;
//
//        TransferQueue;
//
//        ConcurrentLinkedQueue;
//
//
//        ConcurrentSkipListMap;
//
//
//     //   Semaphore;
//        ConcurrentHashMap;
////
////        Hashtable;
////
////        HashMap;
////        String;
//
//        ThreadPoolExecutor;
//
//
//        CyclicBarrier;
//          CountDownLatch;
//         Exchanger;
//
//
//        ForkJoinTask;
//        RecursiveTask;
//        RecursiveAction;
//        ForkJoinPool;
//        CyclicBarrier;


        int[][] a = new int[5][];
        int[] f = new int[]{3,3};
        float d = 4;
        double g = 4;
        Double r = 3.00000000000000000000000000;
        System.out.println(r);

        HashMap<String, String> map = new HashMap<>();

        ArrayList<String> strings = new ArrayList<>();

        strings.toArray();


       int i = (int) Collections.binarySearch(strings,"a");


        System.out.println((10+1)>>>1);
    }



    public synchronized void fun(){

    }

}
