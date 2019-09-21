package test;

/**
 * @author Zhangkj
 * @date 2019-09-10-16:49
 */

class MyData<T>{

    private T value;

    /*public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }*/


    public T getData(){
        return value;
    }

    public void setData(T value){
        this.value = value;
    }
}

public class Test {


    protected void fun(){}

    void fun1(){}


    public static void main(String[] args) {

        int[] ints = new int[2];



        try {
            System.out.println(ints[3]);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("catch");
            return ;
        } finally {
            System.out.println("finally");
        }

        System.out.println("111");
        return;

       /* integerMyData.setData(10);

        Integer data = integerMyData.getData();

        System.out.println(data);

        MyData<String> integerMyData2 = new MyData<String>();

        integerMyData2.setData("1"+"0");

        String data2 = integerMyData2.getData();

        System.out.println(data2);
*/

    }

}
class MyException extends Exception{}
