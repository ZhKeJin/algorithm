package classloading;

/**
 * @author Zhangkj
 * @date 2019-08-21-16:40
 */
public class Loading {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}


class SuperClass{

    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 11;

}

class SubClass extends SuperClass{

    static{
        System.out.println("SubClass init！");
    }
}
