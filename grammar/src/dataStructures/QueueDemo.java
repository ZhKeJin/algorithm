package dataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Zhangkj
 * @date 2019-08-09-16:46
 */
public class QueueDemo {

    public static void main(String[] args) {

//        Queue<String> queue = new Queue<String>();

        Queue<String> queue = new LinkedList<String>();

        ((LinkedList<String>) queue).offerFirst("asdf");
        ((LinkedList<String>) queue).offerFirst("asdf111");
        ((LinkedList<String>) queue).offerFirst("asdf1111");
        ((LinkedList<String>) queue).offerFirst("asdf111111");

        while(!queue.isEmpty()) {
            System.out.println(((LinkedList<String>) queue).pollLast());
        }


        Stack<String> strings = new Stack<>();

        strings.push("asdfas");
        strings.push("asdfas333");
        strings.push("asdfas222");
        strings.push("asdfas111");

        for (String string : strings) {

            System.out.println(string);
        }



    }


}
