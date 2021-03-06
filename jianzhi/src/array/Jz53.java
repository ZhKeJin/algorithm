package array;

/**
 * @author Zhangkj
 * @date 2019-12-13-22:17
 */

import com.sun.deploy.panel.ITreeNode;
import sun.rmi.server.InactiveGroupException;

import java.lang.annotation.Target;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Jz53 {

    public static void main(String[] args) {

        Jz53  jzGetpaixuNumberOfK = new Jz53 ();
        int i = jzGetpaixuNumberOfK.GetNumberOfK(new int[]{1, 1, 1, 1, 1, 2, 3, 4, 5, 5, 6, 6, 6, 6}, 6);
        int j = jzGetpaixuNumberOfK.GetNumberOfK_1(new int[]{1, 1, 1, 1, 1, 2, 3, 4, 5, 5, 6, 6, 6, 6}, 6);

        System.out.println(i);
        System.out.println(j);
    }


    public int GetNumberOfK_1(int [] array , int k) {

        int left = 0;
        int right = array.length-1;

        int first = leftsearch(array, left,right, k);
        int end=  rightsearch(array, left,right,k);


        if(first!=-1&& end!=-1){
            return end-first+1;
        }

        return -1;


    }

    private int rightsearch(int[] array, int left, int right,int target) {

        int mid = (left+right)>>1;
        while(left<=right){

            if(array[mid]>target){
                right = mid-1;
            }else if(array[mid]<target){
                left = mid+1;
            }else if(array[mid]==target&&(mid+1)<=right&&array[mid+1]==target){
                left = mid+1;
            }else{
                return mid;
            }

            mid = (left+right)>>1;

        }

        return -1;


    }

    private int leftsearch(int[] array, int left, int right,int target) {

        int mid = (left+right)>>1;
        while(left<=right){

            if(array[mid]>target){
                right = mid-1;
            }else if(array[mid]<target){
                left = mid+1;
            }else if(array[mid]==target&&(mid-1)>=left&&array[mid-1]==target){
                left = mid+1;
            }else{
                return mid;
            }
            mid = (left+right)>>1;

        }

        return -1;
    }


    public int GetNumberOfK(int [] array , int k) {
        int a=0;
        int length = array.length;
        if(length == 0){
            return 0;
        }
        int firstK = getFirstK(array, k, 0, length-1);
        int lastK = getLastK(array, k, 0, length-1);
        if(firstK != -1 && lastK != -1){
            return lastK - firstK + 1;
        }
        return 0;
    }


    //递归写法
    private int getFirstK(int [] array , int k, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = (start + end) >> 1;
        if(array[mid] > k){
            return getFirstK(array, k, start, mid-1);
        }else if (array[mid] < k){
            return getFirstK(array, k, mid+1, end);
        }else if(mid-1 >=0 && array[mid-1] == k){
            return getFirstK(array, k, start, mid-1);
        }else{
            return mid;
        }
    }


    //循环写法
    private int getLastK(int [] array , int k, int start, int end){
        int length = array.length;
        int mid = (start + end) >> 1;
        while(start <= end){
            if(array[mid] > k){
                end = mid-1;
            }else if(array[mid] < k){
                start = mid+1;
            }else if(mid+1 < length && array[mid+1] == k){
                start = mid+1;
            }else{
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }



}
