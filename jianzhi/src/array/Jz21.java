package array;

import javax.sound.midi.InvalidMidiDataException;
import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-12-15-20:05
 */

/**
 * 	调整数组顺序使奇数位于偶数前面
 */
public class Jz21 {

//    public static void main(String[] args) {
//        new System();
//        new Scanner(System.in);
//    }

    public void reOrderArray(int [] array) {

        int i=0;
        int j=array.length;

        int index=-1;

        while(i<j) {

            if ((array[i] % 2) == 1) {
                if (index >= 0) {

                    int ss = array[i];
                    for (int k = i; k > index; k--) {
                        array[k] = array[k - 1];
                    }
                    array[index] = ss;
                    index++;

                }
                i++;
                continue;

            } else {
                if (i == 0) {
                    index = 0;
                }
                if (index == -1) {
                    index = i;
                }
                i++;
                continue;
            }

        }

    }
    public void reOrderArray_1(int [] array) {

        int r= array.length-1;
        int l=0;


        while(l<r){

            while(l<r&&array[l]%2==1){
                l++;
            }
            while(l<r&&array[r]%2!=1){
                r--;
            }


            if(l<r){

                int t = array[l];
                array[l] = array[r];
                array[r] = t;

            }


        }
    }



}
