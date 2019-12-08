package stack;

/**
 * @author Zhangkj
 * @date 2019-12-03-12:18
 */

import java.util.LinkedList;
import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

 */
public class JZ5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {

        JZ5 jz5 = new JZ5();
        jz5.push(1);
        jz5.push(2);
        jz5.push(3);

        System.out.println(jz5.pop());
        System.out.println(jz5.pop());

        jz5.push(4);

        System.out.println(jz5.pop());

        jz5.push(5);

        System.out.println(jz5.pop());
        System.out.println(jz5.pop());


    }


    /**
     * 两个栈  一个入  一个出， 两个栈需要进行调换   只有在 出的为空时，才把 入的全部倒进  出的
     * @param node
     */
    public void push(int node) {

        stack1.push(node);

    }

    public int pop() {

        if(stack2.empty()){

            while(!stack1.empty()){

                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();


    }



}
