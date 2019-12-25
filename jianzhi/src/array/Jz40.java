package array;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Zhangkj
 * @date 2019-12-15-17:14
 */
/*
 最小的K个数
 */


public class Jz40 {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new Jz40().GetLeastNumbers_Solution(new int[]{2, 3, 5, 1, 9, 6, 4, 0}, 4);
//        ArrayList<Integer> arrayList = new Jz40().GetLeastNumbers_Solution_1(new int[]{2, 3, 5, 1, 9, 6, 4, 0}, 4);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

    }


    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if(k > length || k == 0){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {


            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution_1(int[] input, int k) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        int sort1 = sort1(input, 0, input.length - 1, k);

        System.out.println(sort1);

        for (int i : input) {
            System.out.print(i+" ");
        }
        System.out.println();


       /* if(sort1==-1){
            return null;
        }*/

        for (int i = 0; i < k; i++) {
            arrayList.add(input[i]);
        }




        return arrayList;

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
        if(zmid-1 == l){
            return s;
        }
        if(l>zmid-1){

            int p  = sort1(arr,left, l-1,zmid);

            return p;
        }else{

            int o = sort1(arr, l+1, right,zmid);

            return o;
        }



    }
}

