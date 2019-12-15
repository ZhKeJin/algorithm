package array;

import javax.sound.midi.InvalidMidiDataException;

/**
 * @author Zhangkj
 * @date 2019-12-15-20:05
 */

/**
 * 	调整数组顺序使奇数位于偶数前面
 */
public class Jz21 {

    public void reOrderArray(int [] array) {

        int i=0;
        int j=array.length;

        int index=-1;

        while(i<j){

            if((array[i]%2)==1){
                if(index>=0){

                    int ss = array[i];
                    for (int k = i; k >index ; k--) {
                        array[k] = array[k-1];
                    }

                    index++;

                }
                i++;
                continue;

            }else{
                if(i==0){
                    index = 1;
                }
                if(index == -1){
                    index = i;
                }
                i++;
                continue;
            }

        }



    }


}
