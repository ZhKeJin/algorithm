package array;

/**
 * @author Zhangkj
 * @date 2019-12-15-16:17
 */


import com.sun.deploy.panel.ITreeNode;
import org.omg.CORBA.INTERNAL;
import sun.rmi.server.InactiveGroupException;

import java.net.Inet4Address;
import java.util.LinkedList;

/**
 * 数组中出现次数超过一半的数字
 */
public class Jz39 {


    public static void main(String[] args) {

        int search = new Jz39().search(new int[]{2, 3, 5, 1, 9, 6, 4, 0});
        int search1 = new Jz39().search_2(new int[]{1,2,3,2,2,1,5,2,3});

        System.out.println(search);
        System.out.println(search1);
    }

    public int search_1(int[] arr) {

        int count = 1;

        int index = arr[0];
        for (int i = 1; i < arr.length; i++) {


            if(count==0){
                count=1;
                index = arr[i];
            }
            else if(arr[i] == index){
                count++;
            }else{
                count--;
            }

        }



            int p = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == index ){p++;}
            }

            if(p>arr.length/2){return index;}

        return -1;


    }



    public int search(int[] arr){


        if(arr.length%2==0){
            return 0;
        }

        int count =0;
        int index = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(count==0){
                count =1;
                index = arr[i];
            }else if(index != arr[i]){
                count--;
            }else{
                count++;
            }
            System.out.println(count);

        }

        int n=0;
        for (int i = 0; i < arr.length; i++) {

            if(index == arr[i]) n++;

        }
        if(n<arr.length/2){
            return 0;
        }


        return index;


    }


    public int search_2(int[] arr){

        int left = 0;
        int right = arr.length-1;

        int index  = sort1(arr, left, right, (left + right) / 2);




        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();


        int n=0;
        for (int i = 0; i < arr.length; i++) {

            if(index == arr[i]) n++;

        }
        if(n<=arr.length/2){
            return 0;
        }


        return index;

    }

    private int sort1(int[] arr, int left, int right,int zmid) {

        if(left>=right){
            return -1;
        }


         int l = left;
         int r = right;

         int s = arr[l];

         while(l<r){

             while(l<r&&arr[r]>=s){
                 r--;
             }
             while(l<r&&arr[l]<=s){
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

        if(zmid == l){
            return s;
        }


         if(zmid<l){

             int p  = sort1(arr,left, l-1,zmid);
             return p;
         }else{

             int o = sort1(arr, l+1, right,zmid);
             return o;
         }


//         return p!=-1?p:o;
    }


}
