package thread.src;

/**
 * @author Zhangkj
 * @date 2019-07-29-16:25
 */
//饿汉式
public class SingleDemo {

    private static final SingleDemo s = new SingleDemo();

    private SingleDemo(){}

    public static SingleDemo getInstance(){
        return s;
    }

}

//懒汉式   特点是延迟加载   在多线程访问时就会产生安全隐患  加同步来解决
//延迟加载的单例设计模式
class Single{

    private static Single s = null;
    private Single(){}

    //加锁 解决同步的问题  会比较低效



    public static /*synchronized*/ Single getInstance(){
        //会产生问题  要保证内存的唯一性 在多线程访问时就会产生安全隐患

        //进行双重判断 解决效率的问题
        if(s == null){

            //加同步时使用的锁是哪一个  该类所属的字节码文件对象
            synchronized (Single.class) {
                if(s == null)
                s = new Single();
            }
        }

        return s;

    }

}
