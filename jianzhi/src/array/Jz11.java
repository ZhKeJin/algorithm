package array;

import com.sun.media.sound.SoftTuning;

/**
 * @author Zhangkj
 * @date 2019-12-15-18:19
 */
/*
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 */
public class Jz11 {


    public static void main(String[] args) {


        System.out.println((1+2)/2);
        Jz11 jz11 = new Jz11();
        int i = jz11.minNumberInRotateArray(new int[]{3, 4, 5, 1, 2});

        System.out.println(i);
    }


        public int minNumberInRotateArray(int [] array) {
            int i = 0;
            int j = array.length-1;
            while(i<=j){

                if(i+1==j){
                    return array[j];

                }
                int mid = (i+j)/2;
                if(array[mid]>=array[i]){
                    i = mid;


                }else{

                    j = mid;

                }

            }

            return 0;

        }

    }

