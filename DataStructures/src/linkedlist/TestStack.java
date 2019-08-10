package linkedlist;

import java.util.Stack;

/**
 * @author Zhangkj
 * @date 2019-07-31-16:21
 */
public class TestStack {

    public static void main(String[] args) {

        Stack<Object> objects = new Stack<>();

        objects.push('a');
        objects.push("asdf");
        objects.push(1231);
        objects.push("asdf");

        while (!objects.empty()){

            System.out.println(objects.pop());
        }

    }



}
