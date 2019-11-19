package digui;

/**
 * @author Zhangkj
 * @date 2019-11-13-20:41
 */

/**
 * 爬楼梯
 */
public class Jump {

    public static void main(String[] args) {


        System.out.println(fun(3));
        System.out.println(fun2(5));

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


    static int fun2(int n){

        int i=1;
        int j=2,t;


        int k=3;
        while(k<=n){
            t=j;
            j=i+j;
            k++;
            i=t;
        }

        return j;
    }





}
