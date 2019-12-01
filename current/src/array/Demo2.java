package array;

import java.security.Key;
import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-11-27-17:59
 */

/**
 * 1 2 3 4 5 6 7  k=2  3 4 5 6 7 1 2
 */
public class Demo2 {

    public static void main(String[] args) {

        int[] arr = new int[7];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        resvers(arr, 4);

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }


    static void resvers(int[] arr, int i){

        int length = arr.length-1;

        swap(arr,0,i-1);
        swap(arr,i,length);
        swap(arr,0,length);

    }

    static void swap(int[] arr,int left,int right){


        while(left<right){

            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;

            left++;
            right--;
        }

    }


}
