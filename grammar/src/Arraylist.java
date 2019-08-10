import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Zhangkj
 * @date 2019-07-30-11:36
 */




public class Arraylist {

    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();

        arraylist.add("java1");
        arraylist.add("java1");
        arraylist.add("java1");
        arraylist.add(3,"java3");
        arraylist.add("java1");
        arraylist.add(2);

        Iterator iterator = arraylist.iterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next());


        }



        String[] data = {"1", "4", "3", "2"};
        System.out.println(Arrays.toString(data)); // [1, 4, 3, 2]
        // 实现降序排序，返回-1放左边，1放右边，0保持不变
        Arrays.sort(data, (str1, str2) -> {
            if (str1.compareTo(str2) > 0) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println(Arrays.toString(data)); // [4, 3, 2, 1]



    }

}

/*
class HashSetTest
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();

        hs.add(new Person("a1",11));
        hs.add(new Person("a1",11));
        hs.add(new Person("a2",12));
        hs.add(new Person("a3",13));
//		hs.add(new Person("a2",12));
//		hs.add(new Person("a4",14));

        //sop("a1:"+hs.contains(new Person("a2",12)));

//		hs.remove(new Person("a4",13));


        Iterator it = hs.iterator();

        while(it.hasNext())
        {
            Person p = (Person)it.next();
            sop(p.getName()+"::"+p.getAge());
        }

        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(person1.hashCode());
        System.out.println(person1);
        System.out.println(person2.hashCode());
    }
}
class Person
{
    private String name;
    private int age;

    Person(){}

    Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public int hashCode()
    {
        System.out.println(this.name+"....hashCode");

        System.out.println(name.hashCode()+age*37);
        System.out.println(name.hashCode());
        return name.hashCode()+age*37;
    }

    public boolean equals(Object obj)
    {

        if(!(obj instanceof Person))
            return false;

        Person p = (Person)obj;
        System.out.println(this.name+"...equals.."+p.name);

        return this.name.equals(p.name) && this.age == p.age;
    }


    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
*/

