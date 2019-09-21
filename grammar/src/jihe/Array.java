package jihe;

import org.junit.Test;

import javax.print.DocFlavor;
import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Array extends ArrayList {

    /*
    toarray 的返回值不一定是Object[]
     */
    @Override
    public String[] toArray(Object[] a) {
        return (String[]) super.toArray(a);
    }


    public static void main(String[] args) {

        System.out.println(1<<30);


        System.out.println(5|4);

        System.out.println(tableSizeFor(10));

    }

    //计算hashmap的阈值threshold
    public  static  int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
         System.out.println(n);
         n |= n >>> 2;
         System.out.println(n);
         n |= n >>> 4;
         System.out.println(n);
         n |= n >>> 8;
         System.out.println(n);
         n |= n >>> 16;
//        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;

        return n;


    }

    @Test
    public void hash(){
        System.out.println(Objects.hash());
        System.out.println(Objects.hashCode('a'));
        System.out.println(Object.class);
        int[] ints = new int[]{};
        System.out.println(ints.hashCode());
        System.out.println(Integer.hashCode(3));

        String arr = "ab";
        System.out.println(arr.hashCode());
        System.out.println(32*97+1);
    }

    @Test
    public void hash1(){



        System.out.println(5&4);


        HashMap<String, String> map2 = new HashMap<>(3);


        HashMap<String, String> map = new HashMap<>();
        map.put("1","asdf");
        map.put("2","asdf");
        map.put("3","asdf");
        map.put("4","asdf");
        map.put("5","asdf");
        map.put("6","asdf");
        map.put("7","asdf");
//        map.put("8","asdf");
//        map.put("9","asdf");
//        map.put("10","asdf");
//        map.put("22","asdf");

        HashMap<String, String> map1 = new HashMap<>(map);
    }








}

