package jzoffer;

/**
 * @author Zhangkj
 * @date 2019-12-04-10:09
 */

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class JZ13 {

    public static void main(String[] args) {

        JZ13 jz13 = new JZ13();

        int[] ints = new int[]{3,4,1,5,6,9,8,10};


        jz13.reOrderArray2(ints);

        for (int anInt : ints) {

            System.out.print(anInt+" ");
        }
    }


    public static void reOrderArray2(int [] array) {
        int i = 0;
        int j = array.length;
        int index = -1;
        if (array.length == 0) {  //数组为空，啥也不干！
            return;
        }
        while (i < j) {
            if ((array[i] & 1) == 1) {
                if (index >= 0) {
                    //和index位置元素交换
                    int ss = array[i];
                    for (int in = i; in > index; in--)
                        array[in] = array[in - 1];
                    array[index] = ss;
                    index++;
                }
                i++;
                continue;
            } else {
                //这里很关键，需要记住从左边开始的第一个偶数的位置，如果第一个元素就是偶数，这个临界值一定要考虑到。
                //如果第一个元素不是偶数，那当遍历到第一个偶数的时候，开始记住其角标。
                if (i == 0)
                    index = 0;
                if (index < 0)
                    index = i;
                i++;
                continue;
            }
        }

    }

    public void reOrderArray(int[] array) {

        int j=0,i=0;
        while(j<array.length&&i<array.length){

            //找偶
            while(array[j]%2!=0&&j<array.length){
                j++;
            }

            while (i<array.length&&array[i]%2==0){
                i++;
            }


            System.out.println(j);
            System.out.println(i);
            if(j<i){

                for (int k = i; k > j; k--) {
                    int temp = array[k];
                    array[k] = array[k-1];
                    array[k-1] = temp;
                }
                j=i;
                i=i+1;

            }else{
                i=j+1;
            }
            Arrays.toString(array);


        }


    }
}
