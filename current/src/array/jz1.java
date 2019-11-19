package array;

import jdk.nashorn.internal.runtime.FindProperty;
import sun.font.FontRunIterator;

import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-11-19-21:59
 */
public class jz1 {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {

                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//        boolean find = Find(6, arr);
        boolean find = Find_1(6, arr);
        System.out.println(find);

    }


    public static  boolean Find(int target, int [][] array) {

        for (int i = 0; i < array.length; i++) {

            if(target<array[i+1][0]) {

                for (int j = 0; j < array[1].length; j++) {
                     if(array[i][j]==target)  return true;
                }

            }
            if(i==array.length-1){
                for (int j = 0; j < array[1].length; j++) {
                    if(array[i][j]==target)  return true;

                }
            }
        }

        return false;
    }

    public static  boolean Find_1(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        if (row == 0 || col == 0)
            return false;
        if (target < array[0][0] || target > array[row - 1][col - 1])
            return false;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0)
        {
            if (array[i][j] > target)
            {
                j--;
            }
            else if (array[i][j] < target)
            {
                i++;
            }

            else
            {
                return true;
            }
        }

        return false;


    }

}
