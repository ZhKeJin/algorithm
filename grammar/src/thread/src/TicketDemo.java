package thread.src;

/**
 * @author Zhangkj
 * @date 2019-05-20-13:27
 */

class Ticket extends Thread{

    private int ticket = 100;
    public Ticket() {
    }

    public Ticket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread() + "...." + ticket--);
            }
       /* for (int i = 0; i < 60; i++) {
            System.out.println(Thread.currentThread()+"---"+i);
        }*/
        }
    }
}

public class TicketDemo {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        ticket.start();
        ticket2.start();
        ticket3.start();



        /*for (int i = 0; i < 60; i++) {
            System.out.println(Thread.currentThread()+"---"+i);
        }*/
    }

}
