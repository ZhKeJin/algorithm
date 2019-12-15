package array;

import java.util.ArrayList;

/**
 * @author Zhangkj
 * @date 2019-12-15-17:36
 */
/*
	和为S的数字  该数列是递增的顺序

 */
public class Jz57 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new Jz57().FindNumbersWithSum(new int[]{1, 2, 4, 7, 11, 12, 15}, 15);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {


        ArrayList<Integer> arrayList = new ArrayList<>();


        int l = 0;
        int r = array.length-1;

        while(l<r){
            if(array[l]+array[r]>sum){
                r--;
            }else if(array[l]+array[r]<sum){
                l++;
            }else{
                arrayList.add(array[l]);
                arrayList.add(array[r]);
                break;
            }
            System.out.println(l+"...."+r);

        }
        return arrayList;

    }




}
