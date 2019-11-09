package jihe;

import java.util.*;

/**
 * @author Zhangkj
 * @date 2019-08-10-16:55
 */

class StuNameComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        int num = s1.getName().compareTo(s2.getName());
        if(num==0)
            return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));

        return num;
    }
}



class Student implements Comparable<Student>
{
    private String name;
    private int age;
    Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

   /* public int compareTo(jihe.Student s)
    {
        int num = new Integer(this.age).compareTo(new Integer(s.age));

        if(num==0)
            return this.name.compareTo(s.name);
        return num;
    }
*/
    public int hashCode()
    {
        return name.hashCode()+age*34;
    }
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Student))
            throw new ClassCastException("类型不匹配");

        Student s = (Student)obj;

        return this.name.equals(s.name) && this.age==s.age;


    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return name+":"+age;
    }


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}







class HashMapsadf {



    public static void fun(String[] args) {

    }
    public static void main(String[] args) {
        HashMap hm = new HashMap();

       /* TreeMap<Integer, String> objectObjectTreeMap = new TreeMap<>();
        TreeMap<jihe.Student, String> hm = new TreeMap<>();*/

//        objectObjectTreeMap.put(1,"asdf");
//        objectObjectTreeMap.put(1,"asdf");
//        objectObjectTreeMap.put(1,"asdf");
//        objectObjectTreeMap.put(1,"asdf111");
//        objectObjectTreeMap.put(222,"asdf111");
//        objectObjectTreeMap.put(13,"asdf111");
//        objectObjectTreeMap.put(133,"asdf111");
//        objectObjectTreeMap.put(13,"asdf111");
        hm.put(new Student("lisi1",21),"beijing");
        hm.put(new Student("lisi1",21),"tianjin");
        hm.put(new Student("lisi2",22),"shanghai");
        hm.put(new Student("lisi3",23),"nanjing");
        hm.put(new Student("lisi4",24),"wuhan");

        Set<Student> objects = hm.keySet();

        for (Student object : objects) {
            System.out.println(object+"......."+hm.get(object));
        }

        /*for (Map.Entry<Integer,String>  me: objectObjectTreeMap.entrySet()) {
            System.out.println(me.getKey()+".................."+me.getValue());
        }
*/


       /* hm.put(1,"asd");
        hm.put(1,"asd");
        hm.put(1,"asd");
        hm.put(1,"asd");

        hm.put(new jihe.Student("lisi1",21),"beijing");
        hm.put(new jihe.Student("lisi1",21),"tianjin");
        hm.put(new jihe.Student("lisi2",22),"shanghai");
        hm.put(new jihe.Student("lisi3",23),"nanjing");
        hm.put(new jihe.Student("lisi4",24),"wuhan");

        //第一种取出方式 keySet

        Set<jihe.Student> keySet = hm.keySet();

        Iterator<jihe.Student> it = keySet.iterator();

        while(it.hasNext())
        {
            jihe.Student stu = it.next();
            String addr = (String) hm.get(stu);
            System.out.println(stu+".."+addr);
        }



        //第二种取出方式 entrySet
        Set<Map.Entry<jihe.Student,String>> entrySet = hm.entrySet();

        Iterator<Map.Entry<jihe.Student,String>> iter = entrySet.iterator();

        while(iter.hasNext())
        {
            Map.Entry<jihe.Student,String> me = iter.next();
            jihe.Student stu = me.getKey();
            String addr = me.getValue();
            System.out.println(stu+"........."+addr);
        }*/
    }
}


