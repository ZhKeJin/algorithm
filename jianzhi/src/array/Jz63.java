package array;

/**
 * @author Zhangkj
 * @date 2019-12-17-23:00
 */
public class Jz63 {


    public int getmaxfip(int[] arr){

        int min = arr[0];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<min){
                min = arr[i];

            }else if(arr[i]-min>max){
                max = arr[i]-min;
            }

        }
        return max;

    }

}
