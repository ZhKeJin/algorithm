package reflect;


/**
 * @author Zhangkj
 * @date 2019-09-10-16:34
 */
public class Reflect {

    public static void main(String[] args) {

        //得到class对象
        Class<? extends String> aClass = "".getClass();
        Class c2 = String.class;

        try {
            Class<?> aClass1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }






    }

}
