package digui;

/**
 * @author Zhangkj
 * @date 2019-11-13-20:41
 */
public class Test1 {

    public static void main(String[] args) {


        System.out.println(fun(3));

    }

    static int fun(int n){

        if(n<=0)
            return 0;
        if(n == 1 ){
            return 1;
        }
        if(n == 2 ){
            return 2;
        }

        return fun(n-1)+fun(n-2);

    }





}