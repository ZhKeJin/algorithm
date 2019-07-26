package thread.src;

import sun.print.SunMinMaxPage;

/**
 * 实现两个人同时存钱 一次存100 一共存三百
 *
 * 找出安全问题
 *
 *
 * @author Zhangkj
 * @date 2019-05-20-14:38
 */

class Bank{
    private int sum;

    public synchronized void add(int num){
        sum+= num;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread()+"..."+sum);
    }
}


class User implements Runnable{

    private Bank bank = new Bank();

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            bank.add(100);
        }


    }
}




public class BankDemo {

    public static void main(String[] args) {
        User user = new User();
        new Thread(user).start();
        new Thread(user).start();


    }

}
