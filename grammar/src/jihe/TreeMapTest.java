package jihe;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Zhangkj
 * @date 2019-09-23-11:19
 */
class SortedTest {
    private int age;
    public SortedTest(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class SortedTestComparator implements Comparator<SortedTest> {
    //自定义比较器：实现compare(T o1,T o2)方法：
    public int compare(SortedTest sortedTest1, SortedTest sortedTest2) {
        int num = sortedTest1.getAge() - sortedTest2.getAge();
        if(num==0){//为0时候，两者相同：
            return 0;
        }else if(num>0){//大于0时，后面的参数小：
            return 1;
        }else{//小于0时，前面的参数小：
            return -1;
        }
    }
}

public class TreeMapTest {
    public static void main(String[] agrs){
        //自定义顺序比较
        customSort();
    }
    //自定义排序顺序:
    public static void customSort(){


        TreeMap<Integer,String> treeMapFirst = new TreeMap<Integer, String>();
        treeMapFirst.put(1,"jiaboyan");
        treeMapFirst.put(6,"jiaboyan");
        treeMapFirst.put(3,"jiaboyan");
        treeMapFirst.put(10,"jiaboyan");
        treeMapFirst.put(7,"jiaboyan");
        treeMapFirst.put(13,"jiaboyan");
        System.out.println(treeMapFirst.toString());

        TreeMap<SortedTest,String> treeMap = new TreeMap<SortedTest, String>(new SortedTestComparator());
        treeMap.put(new SortedTest(10),"hello");
        treeMap.put(new SortedTest(21),"my");
        treeMap.put(new SortedTest(15),"name");
        treeMap.put(new SortedTest(2),"is");
        treeMap.put(new SortedTest(1),"jiaboyan");
        treeMap.put(new SortedTest(7),"world");
        System.out.println(treeMap.toString());
    }
}