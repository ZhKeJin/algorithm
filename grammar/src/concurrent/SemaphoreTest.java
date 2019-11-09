package concurrent;

import java.util.concurrent.*;

/**
 * @author Zhangkj
 * @date 2019-10-02-16:23
 */
public class SemaphoreTest {
    //排队总人数
    private static final int COUNT =20;
    //只有三个柜台
    private static final Semaphore AVALIABLECOUNT = new Semaphore(3);

//    public static void main(String[] args) {
//        //创建一个线程池
//        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(COUNT);
//        BasicThreadFactory.Builder builder = new BasicThreadFactory.Builder().namingPattern("线程池");
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(COUNT, COUNT, 30L, TimeUnit.SECONDS, workQueue,
//                builder.build());
//        for (int i = 0; i < COUNT; i++) {
//            final int count = i;
//            //排队的人都需要被服务，所以所有的人直接提交线程池处理
//            threadPoolExecutor.execute(() -> {
//                try {
//                    //使用acquire获取共享锁
//                    AVALIABLECOUNT.acquire();
//                    System.out.println(Thread.currentThread().getName());
//                    System.out.println("服务号"+count+"正在服务");
//                    Thread.sleep(1000);
//                }catch (Exception e){
//                    System.out.println(e.getMessage());
//                }
//                finally {
//                    //获取完了之后释放资源
//                    AVALIABLECOUNT.release();
//                }
//            });
//        }
//        threadPoolExecutor.shutdown();
//    }
}
