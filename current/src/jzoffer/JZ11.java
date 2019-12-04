package jzoffer;

/**
 * @author Zhangkj
 * @date 2019-12-04-9:52
 */

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class JZ11 {

    public static void main(String[] args) {

        JZ11 jz11 = new JZ11();

        jz11.NumberOf1(4);
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(-4));
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(-0));

    }

    public int NumberOf1_1(int n) {

        int sum = 0;

        int index =1;
        while(index!=0){

            if((index&n)==1){
                sum++;
            }
            index = index<<1;
        }

        return sum;

    }





    public int NumberOf1(int n) {
        int sum=0;
        int index=1;
        while (index!=0){
            if ((n&index)!=0){
                sum++;
            }
            index=index<<1;
        }
        return sum;
    }



}
