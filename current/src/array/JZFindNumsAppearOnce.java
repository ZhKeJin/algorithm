package array;

/**
 * @author Zhangkj
 * @date 2019-12-11-22:56
 */


import jdk.nashorn.internal.ir.Flags;

import java.util.HashMap;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class JZFindNumsAppearOnce {

    public static void main(String[] args) {

//        int[] ints = {2, 3, 4, 6, 6,3, 9, 2, 9, 0};
        int[] ints = {2,4,3,6,3,2,5,5};

        int[] ints1 = new int[1];
        int[] ints2 = new int[1];
        JZFindNumsAppearOnce jzFindNumsAppearOnce = new JZFindNumsAppearOnce();

        jzFindNumsAppearOnce.FindNumsAppearOnce(ints,ints1,ints2);

        System.out.println(ints1[0]+"......"+ints2[0]);


    }


    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {


        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i <array.length; i++) {

            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i],1);
            }else{
                Integer count = hashMap.get(array[i]);
                count++;
                hashMap.put(array[i],count);
            }

        }

        boolean flag =true;
        for (Integer integer : hashMap.keySet()) {

            if(hashMap.get(integer)==1){
                System.out.println(integer);
                if(flag) {
                    num1[0] = integer;
                    flag=!flag;
                }else{
                    num2[0] = integer;
                }
            }
        }


    }

}
