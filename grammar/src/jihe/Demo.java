package jihe;

import com.sun.corba.se.impl.resolver.FileResolverImpl;
import com.sun.media.sound.SoftTuning;
import javafx.scene.input.InputMethodTextRun;
import org.junit.Test;
import thread.src.MathTest;

import javax.xml.transform.Source;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Zhangkj
 * @date 2019-09-15-19:51
 */
class Demo extends MathTest {

    public static void main(String[] args) {

        ArrayDemo arrayDemo = new ArrayDemo();

        arrayDemo.fun();

        MathTest mathTest = new MathTest();

        ArrayList<String> strings = new ArrayList<>(6);


        LinkedList<String> link = new LinkedList<>();

        link.addFirst("asdfas");
        link.offerFirst("asdf3");
        link.offerFirst("asdf2");
        link.offerFirst("asdf1");

        Iterator<String> iterator = link.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String string : link) {
            System.out.println(string);
        }


        Stack<String> strings1 = new Stack<String>();


        CopyOnWriteArrayList<String> strings2 = new CopyOnWriteArrayList<>();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(18 ^ 4);
        System.out.println(19 ^ 5);
        System.out.println(22 ^ 14);


        for (String string : strings2) {

        }

        for (int i = 0; i < 1111; i++) {

        }


    }


    @Test
    public void map() {

        HashMap<String, String> map = new HashMap<>();


        for (int i = 0; i < 100; i++) {
            System.out.println(8&i);
        }




    }

}


