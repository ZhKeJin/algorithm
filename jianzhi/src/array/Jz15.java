package array;

/**
 * @author Zhangkj
 * @date 2019-12-15-22:28
 */

import com.sun.javaws.jnl.InformationDesc;

import javax.swing.*;
import java.util.concurrent.CountDownLatch;

/**
 * 数中的二进制中的1 的个数
 */
public class Jz15 {


    public static void main(String[] args) {

        int i = new Jz15().NumberOf1(7);
        int j = new Jz15().NumberOf2(7);
        System.out.println(j);

        System.out.println(i);
    }


    public int NumberOf2(int n) {

        int index = 1;

        int count =0;
        while(index!=0){

            if((n&index )!=0){
                count++;
            }
            index = index<<1;
        }

        return count;


    }













        public int NumberOf1(int n) {


        int index = 1;
        int count =0;
        while(index!=0){
            if((n&index)==1){
                count++;
            }
           index =  index<<1;
        }



        return count;
    }

}
