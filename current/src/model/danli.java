package model;

import java.awt.print.PrinterGraphics;

/**
 * @author Zhangkj
 * @date 2019-11-29-9:20
 */
public class danli {




}


/**
 * 饿汉式   线程安全，调用效率高。但是不能延时加载
 */
class SingleDemo1{

    private static SingleDemo1 Instance = new SingleDemo1();


    private SingleDemo1(){}

    public static SingleDemo1 getInstance(){

        return Instance;
    }

}


/**
 * 懒汉式
 */
class SingleDemo2{

    private static SingleDemo2  singleDemo2 = null;

    private  SingleDemo2(){}

    public static SingleDemo2 getInstance(){

        if(singleDemo2 == null){
            singleDemo2 = new SingleDemo2();
        }
        return singleDemo2;
    }
}

/**
 * 懒汉式： 线程安全
 */
class SingleDemo3{

    private static SingleDemo3  singleDemo3 = null;

    private  SingleDemo3(){}

    public static SingleDemo3 getInstance(){

        if(singleDemo3 == null){
            synchronized (SingleDemo3.class ){
                if(singleDemo3 == null) {

                    singleDemo3 = new SingleDemo3();
                }
            }
        }
        return singleDemo3;
    }
}

