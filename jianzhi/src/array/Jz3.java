package array;

import java.io.CharArrayReader;

/**
 * @author Zhangkj
 * @date 2019-12-15-21:47
 */

/**
 * 数组中在 0 - n-1 中  求重复的数字
 */
public class Jz3 {

    public int getfirst(int[] array){

        for (int i = 0; i < array.length; i++) {


            while(array[i]!=i){
                //交换
                if(array[i] == array[array[i]]){
                    return array[i];
                }
                int temp = array[i];
                array[i] = array[array[i]];
                array[temp] = temp;

            }
        }

        return -1;

    }


}
