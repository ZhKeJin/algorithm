package stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhangkj
 * @date 2019-12-03-13:03
 */
public class JZ5_2 {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public static void main(String[] args) {

        JZ5_2 jz5_2= new JZ5_2();
        jz5_2.push(1);
        jz5_2.push(2);
        jz5_2.push(3);
        System.out.println(jz5_2.top());

//        System.out.println(jz5_2.pop());
//        System.out.println(jz5_2.pop());
//
//        jz5_2.push(4);
//
//        System.out.println(jz5_2.pop());
//
//        jz5_2.push(5);
//
//        System.out.println(jz5_2.pop());
//        System.out.println(jz5_2.pop());
//
//        System.out.println();


    }


    /**
     * 两个栈  一个入  一个出， 两个栈需要进行调换   只有在 出的为空时，才把 入的全部倒进  出的
     * @param x
     */



    public void push(int x) {

        queue1.add(x);

    }

    public int pop() {


        while(queue1.size()>1){

            queue2.add(queue1.poll());
        }

        Queue temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return queue2.poll();


    }

    public int top() {

        while(queue1.size()>1){

            queue1.peek();
        }
        return queue1.peek();

    }


    public boolean empty() {
        return queue1.isEmpty();
    }





}
