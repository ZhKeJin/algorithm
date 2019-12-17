package other;

import jdk.nashorn.internal.ir.ReturnNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Zhangkj
 * @date 2019-12-17-14:39
 */


/*
队列的最大值：固定滑动窗口的最大值
 */


public class Jz59 {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new Jz59().maxInWindows(new int[]{2, 3, 4, 2, 6, 2, 5, 1}, 3);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }

    public ArrayList<Integer> maxInWindows(int [] num, int size) {


        ArrayList<Integer> arrayList = new ArrayList<>();

        if(size ==0){
            return arrayList;
        }

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < num.length; i++) {

//            if(linkedList.isEmpty()){
//                linkedList.add(i);
//            }

            if(!linkedList.isEmpty()&&i-linkedList.peek()>=size){
                linkedList.poll();
            }

            while(!linkedList.isEmpty()&&num[i]>num[linkedList.peekLast()]) {
                linkedList.pollLast();

            }

            linkedList.add(i);

            if (i >= size-1) {

                arrayList.add(num[linkedList.peek()]);

            }

        }

        return arrayList;

    }

}
