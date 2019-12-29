package sort;


import java.util.Arrays;

/**
 * @author Zhangkj
 * @date 2019-12-23-16:58
 */

/**
 * 快排
 */
public class Sort {

    public static void main(String[] args) {

        Sort sort = new Sort();

        int[] arr = new int[]{3,5,6,8,1,3,9,0};
        sort.sort(arr,0,arr.length-1);

        for (int i : arr) {

            System.out.print(i+" ");
        }

        Arrays.toString(arr);

    }


    public void sort(int[] arr, int left,int right){

        if(left>=right){
            return;
        }

        int l = left;
        int r = right;

        int s = arr[left];

        while(l<r){

            while(arr[r]>=s&&l<r){
                r--;
            }
            while(arr[l]<=s&&l<r){
                l++;
            }

            if(l<r){

                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

            }

        }

        arr[left] = arr[l];
        arr[l] = s;

        sort(arr,left,l-1);
        sort(arr,l+1,right);



    }



}
