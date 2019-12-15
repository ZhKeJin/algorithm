package array;

/**
 * @author Zhangkj
 * @date 2019-12-13-21:19
 */

import java.util.IntSummaryStatistics;

/**
 * 一个整型数组里除两个数字之外，其他数字都出现了两次。
 * 请找出这个两个只出现一次的数字，时间复杂度O(n),空间复杂度O(1)     数组中只出现一次的数字
 */
public class Jz56 {

    public static void main(String[] args) {

        int[] ints = {2, 4, 3, 6, 3, 2, 5, 5};

        Jz56 jz56 = new Jz56();


        int[] ints1 = new int[1];
        int[] ints2 = new int[1];


        jz56.FindNumsAppearOnce(ints,ints1,ints2);

    }




        public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

            int xor1 = 0;
            for(int i=0; i < array.length; i++)
                xor1 = xor1^array[i];
            //在xor1中找到第一个不同的位对数据进行分类，分类为两个队列对数据进行异或求和找到我们想要的结果
            int index = 1;
            while((index & xor1)==0)
                index = index <<1;//因为可能有多个位为1所以需要求一下位置
            int result1 = 0;
            int result2 = 0;
            for(int i=0; i < array.length; i++){
                if((index & array[i]) == 0)
                    result1 = result1^array[i];
                else
                    result2 = result2^array[i];
            }
            num1[0] = result1;
            num2[0] = result2;
        }

        public void FindNumsAppearOnce_1(int [] array,int num1[] , int num2[]) {

            int index =0;

            for (int i = 0; i < array.length; i++) {
                index = index ^array[i];
            }

            int e = 1;
            while((index&1)==0){
                e = e<<1;
            }

            int result1 = 0;
            int result2 = 0;
            for (int i = 0; i < array.length; i++) {

                if((array[i]^e)==0){
                    result1^=array[i];
                } else{
                    result2^=array[i];
                }
            }

        }




}
