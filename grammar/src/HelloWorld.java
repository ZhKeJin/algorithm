

/**
 * @author Zhangkj
 * @date 2019-07-24-17:04
 */
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("hello world");
        byte a = -128;

        //二进制
        System.out.println(Integer.toBinaryString(-128));
        System.out.println();


        //类型
        int i;

        float b = 1.2f;

        double d = 3.33;

        System.out.println(b+".."+d);

        //字符A65~90Z   97a~z122
        char c = 90;
        System.out.println(c);

        //类型转化  ：类型提升 为int  所以接受时也为最大类型的变量

        byte by = 3;
        i = by + 2;
        //强制转换
        by = (byte) (by + 2);
        System.out.println(i);
        System.out.println(by);

        //转义字符
        System.out.println("hello\r\nworld");

        char zi = '我';
        System.out.println(zi);

        //逻辑运算符 & &&的区别
        //& 无论左边是true 祸false 右边都运算
        //&& 左边为true 右边不运算

        // |：左右两边都参与运算
        // || : 左边为true时，就结束运算  结果为true

        int w = 3;

        System.out.println(w>4&&w<6);
        System.out.println(w>2&w<6);

        // ^:两异为一
        System.out.println(true ^ true);


        //位移运算 <<乘以移动的2的幂次方 >>除以2的幂次方


        // >> : 最高位补0或补1 由原来的数据的最高位决定

        // >>> : 无符号的右移 ， 最后都补0

        System.out.println(22>>2);
        System.out.println(-2<<2);
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(1<<31));
        System.out.println(1<<31);


        //取反
        System.out.println(Integer.toBinaryString(~6+1));

        //交换两个数
        //1. 临时变量  2.加减运算  3.做^ 异或

        int x=4, y=8;

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println(x+y);
        System.out.println(x+"....."+"....."+y);


        System.out.println((char) (3));


    }

}
