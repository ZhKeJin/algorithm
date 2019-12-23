package other;

import org.omg.CORBA.INTERNAL;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhangkj
 * @date 2019-12-23-17:49
 */
public class Duizhan {

    Queue<Integer> queue1 = new LinkedList();
    Queue<Integer> queue2 = new LinkedList();

    public void push(Integer integer){

        queue1.add(integer);
    }

    public int pop(){

        if(queue1.size()>1){
            queue2.add(queue1.poll());
        }

        Queue temp = queue1;
        queue1 = queue2;
        queue2 =temp;

        return queue2.poll();
    }




}
