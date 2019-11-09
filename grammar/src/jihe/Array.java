package jihe;

import com.sun.corba.se.impl.resolver.FileResolverImpl;
import com.sun.javafx.sg.prism.web.NGWebView;
import org.junit.Test;

import javax.print.DocFlavor;
import javax.xml.transform.Source;
import java.security.Key;
import java.util.*;
import java.util.function.BiConsumer;

import static java.lang.Math.exp;
import static java.lang.Math.pow;

public class Array extends ArrayList {

    @Test
    public void fun(){


        Boolean fa = Boolean.FALSE;
        String s = new String("asdf");

       new  StringBuffer();
        new StringBuilder();

        s="asduuuf";
        System.out.println(s);
//        Object;
//        Integer;

        int i = fa.hashCode();
        System.out.println(i);
    }




    /*
    toarray 的返回值不一定是Object[]
     */
    @Override
    public String[] toArray(Object[] a) {
        return (String[]) super.toArray(a);
    }


    public static void main(String[] args) {

        System.out.println(1 << 30);


        System.out.println(5 | 4);

        System.out.println(tableSizeFor(10));

    }

    //计算hashmap的阈值threshold
    public static int tableSizeFor(int cap) {
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
    public void hash() {
        System.out.println(Objects.hash());
        System.out.println(Objects.hashCode('a'));
        System.out.println(Object.class);
        int[] ints = new int[]{};
        System.out.println(ints.hashCode());
        System.out.println(Integer.hashCode(3));

        String arr = "ab";
        System.out.println(arr.hashCode());
        System.out.println(32 * 97 + 1);
    }


    @Test
    public void map() {

        HashMap<String, String> map = new HashMap<>();

        String a ="a";

        for (int i = 0; i < 100; i++) {



            a = a+ "a";
            System.out.println(a);
            System.out.println(8&a.hashCode());
        }




    }




    @Test
    public void hash1() {
       /* HashMap 底层是基于散列算法实现，散列算法分为散列再探测和拉链式。HashMap 则使用了拉链式的散列算法，并在 JDK 1.8 中引入了红黑树优化过长的链表
        实现注意事项。
        链表结构（这里叫 bin ，箱子）
        Map通常充当一个binned（桶）的哈希表，但是当箱子变得太大时，它们就会被转换成TreeNodes的箱子，每个箱子的结构都类似于java.util.TreeMap。
        大多数方法都尝试使用普通的垃圾箱，但是在适用的情况下（只要检查一个节点的实例）就可以传递到TreeNode方法。
        可以像其他的一样遍历和使用TreeNodes，但是在过度填充的时候支持更快的查找
        然而，由于大多数正常使用的箱子没有过多的填充，所以在表方法的过程中，检查树箱的存在可能会被延迟。
        树箱(bins即所有的元素都是TreeNodes）主要是由hashCode来排序的，但是在特定的情况下，
                如果两个元素是相同的“实现了Comparable接口”，那么使用它们的比较方法排序。
                （我们通过反射来保守地检查泛型类型，以验证这一点——参见方法comparableClassFor）。
                使用树带来的额外复杂，是非常有价值的，因为能提供了最坏只有O(log n)的时间复杂度当键有不同的散列或可排序。
                因此,性能降低优雅地在意外或恶意使用hashCode()返回值的分布很差,以及许多key共享一个hashCode,只要他们是可比较的。
                （如果这两种方法都不适用，同时不采取任何预防措施，我们可能会在时间和空间上浪费大约两倍的时间。
                但是，唯一已知的案例源于糟糕的用户编程实践，这些实践已经非常缓慢，这几乎没有什么区别。）
                因为TreeNodes大小大约是普通节点的两倍，所以只有当容器包含足够的节点来保证使用时才使用它们（见treeifythreshold）。
                当它们变得太小（由于移除或调整大小），它们就会被转换回普通bins。
                在使用良好的用户hashcode的用法中，很少使用树箱。
                理想情况下，在随机的hashcode中，箱子中节点的频率遵循泊松分布（http://en.wikipedia.org/wiki/Poisson_distribution），
        默认大小调整阈值为0.75，但由于调整粒度的大小有很大的差异。
        忽略方差，list的长度 k=(exp(-0.5) * pow(0.5, k) / factorial(k))
        第一个值是:
        0:0.60653066
        1:0.30326533
        2:0.07581633
        3:0.01263606
        4:0.00157952
        5:0.00015795
        6:0.00001316
        7:0.00000094
        8:0.00000006
        more: less than 1 in ten million
        树箱（tree bin很难翻译啊！）的根通常是它的第一个节点。
        然而，有时（目前只在Iterator.remove）中，根可能在其他地方，但是可以通过父链接（方法TreeNode.root()）恢复。
        所有适用的内部方法都接受散列码作为参数（通常由公共方法提供），允许它们在不重新计算用户hashcode的情况下调用彼此。
        大多数内部方法也接受一个“标签”参数，通常是当前表，但在调整或转换时可能是新的或旧的。
        当bin列表被树化、分割或取消时（ treeified, split, or untreeified），我们将它们保持在相同的相对存取/遍历顺序（例如
        字段Node.next）为了更好地保存位置，并稍微简化对调用迭代器的拆分和traversals的处理(splits and traversals that invoke iterator.remove)。
        当在插入中使用比较器时，为了在重新平衡中保持一个总排序（或者在这里需要的接近），我们将类和标识符码作为连接开关。
        由于子类LinkedHashMap的存在，普通(plain)与树模型(tree modes)之间的使用和转换变得复杂起来。
        请参阅下面的hook方法，这些方法在插入、删除和访问时被调用，允许LinkedHashMap内部结构保持独立于这些机制。
            （这还要求将Map实例传递给一些可能创建新节点的实用方法。）
        concurrent-programming-like SSA-based编码风格有助于避免在所有扭曲的指针操作中出现混叠错误。
*/

        HashSet hashSet = new HashSet<String>();

        System.out.println(5 & 4);


        HashMap<String, String> map2 = new HashMap<>(3);


        HashMap<String, Object> objectObjectHashMap = new HashMap<>();

        new Object();
        //new Objects();


        HashMap<String, String> map = new HashMap<>();
        map.put("1", "asdf");
        map.put("2", "asdf");
        map.put("3", "asdf");
        map.put("4", "asdf");
        map.put("5", "asdf");
        map.put("6", "asdf");
        map.put("7", "asdf");
        map.put("8", "asdf");
        map.put("9", "asdf");
        map.put("10", "asdf");
        map.put("11", "asdf");
        map.put("12", "asdf");
        map.put(null,"sadf");

        Set<String> strings = map.keySet();

        for (String string : strings) {
            System.out.println(string + "...." + map.get(string));
        }


        HashMap<String, String> map1 = new HashMap<>(map);

        int h;

        for (int i = 0; i < 30; i++) {

            String key = String.valueOf(i);
            System.out.println(key.hashCode());
            h = key.hashCode()^ (key.hashCode() >>> 16);
            System.out.println((16 - 1) & h);
        }
        System.out.println(97*31+98);
    }


    //LinkedHashMap
    @Test
    public void linkhashmap() {

        HashMap<String, String> map2 = new LinkedHashMap<>();


        HashMap<Object, Object> map = new LinkedHashMap<>();
        Hashtable<String, String> stringStringHashtable = new Hashtable<>();

        map.put(1, "asdf");
        map.put("2", "asdf");
        map.put('a', "asdf");
        map.put("4", "asdf");
        map.put("5", "asdf");
        map.put("6", "asdf");
        map.put("7", "asdf");
        map.put("8", "asdf");
        map.put("9", "asdf");
        map.put("10", "asdf");
        map.put("11", "asdf");
        map.put("12", "asdf");


        Set<Object> strings = map.keySet();

        for (Object string : strings) {
            System.out.println(string + "...." + map.get(string));
        }


        Set<Map.Entry<Object, Object>> entries = map.entrySet();

        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry next = iterator.next();

            Object key = next.getKey();
            Object value = next.getValue();

            System.out.println(key + "..." + value);


        }


        LinkedHashMap<String, String> HashMap = new LinkedHashMap<>();

        int k = 7;
        double p = (exp(-0.5) * pow(0.5, k) / factorial(k));

        System.out.println(p);

    }


    public static int factorial(int k) {

        int num = 1;
        for (int i = 2; i <= k; i++) {

            num *= i;
        }
        return num;

    }


    public void listtest(){

        //ArrayList;

    }



    @Test
    public void treemap() {
        TreeMap<String, String> TreeMap = new TreeMap<>();

        TreeMap.put("1", "ASDF");
        TreeMap.put("1", "ASDF");
        TreeMap.put("1", "ASDF");
        TreeMap.put("1", "ASDF");
        TreeMap.put("1", "ASDF");
        TreeMap.put("1", "ASDF");
        TreeMap.put("1", "ASDF");


//        TreeMap.forEach();


        Set<Map.Entry<String, String>> entries = TreeMap.entrySet();


        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> next = iterator.next();

            String value = next.getValue();

            String key = next.getKey();

            System.out.println(value + "....." + key);
        }


        for (Map.Entry<String, String> entry : entries) {

            String value = entry.getValue();
            String key = entry.getKey();

        }


        Set<String> strings = TreeMap.keySet();

        for (String string : strings) {

            String string1 = TreeMap.get(string);

            System.out.println(string + "..." + string1);
        }




    }
}
