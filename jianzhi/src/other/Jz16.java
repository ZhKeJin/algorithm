package other;

import java.util.Hashtable;

/**
 * @author Zhangkj
 * @date 2019-12-18-22:57
 */

/**
 * 数值的整数次方
 */
public class Jz16 {

    public static void main(String[] args) {

        new Hashtable<>();

        Jz16 jz16 = new Jz16();

        System.out.println(12&3);
        System.out.println(11&3);
        System.out.println(111&3);
        System.out.println(112&3);
        System.out.println(15&3);
        System.out.println(14&3);
        System.out.println(13&3);
        System.out.println(5>>1&1);  //2的次方减一
    }

    /**
     * 1.全面考察指数的正负、底数是否为零等情况。
     * 2.写出指数的二进制表达，例如13表达为二进制1101。
     * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
     * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
     */
    public double Power(double base, int n) {
        double res = 1,curr = base;
        int exponent;
        if(n>0){
            exponent = n;
        }else if(n<0){
            if(base==0)
                throw new RuntimeException("分母不能为0");
            exponent = -n;
        }else{// n==0
            return 1;// 0的0次方
        }
        while(exponent!=0){
            if((exponent&1)==1)
                res*=curr;
            curr*=curr;// 翻倍
            exponent>>=1;// 右移一位
        }
        return n>=0?res:(1/res);
    }






}
