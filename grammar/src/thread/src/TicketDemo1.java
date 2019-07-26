package thread.src;

/**
 * @author Zhangkj
 * @date 2019-05-20-13:27
 */

class Ticket1 implements Runnable {

    private int ticket = 100;
    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + "----" + ticket--);
                }
            }
        }
    }
}

public class TicketDemo1 {

    public static void main(String[] args) {

        Ticket1 ticket1 = new Ticket1();

        new Thread(ticket1).start();
        new Thread(ticket1).start();
        new Thread(ticket1).start();


      /*  Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        ticket.start();
        ticket2.start();
        ticket3.start();*/



    }

}
