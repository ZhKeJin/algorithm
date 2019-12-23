package other;

import java.util.Stack;

/**
 * @author Zhangkj
 * @date 2019-12-23-17:45
 */
public class ZhanDui {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(Integer integer){

        stack1.push(integer);

    }

    public int pop(){

        if(stack2.isEmpty()){

            stack2.push(stack1.pop());

        }

        return stack2.pop();
    }


}
