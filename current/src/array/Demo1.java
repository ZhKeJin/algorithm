package array;

/**
 * @author Zhangkj
 * @date 2019-11-12-20:45
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 找出B数组中不包含A数组的元素  A有序
 */
public class Demo1 {

    public static void main(String[] args) {

        int[] A = {2, 4, 7, 8, 11, 14, 19};
        int[] B = {21, 4, 7, 48, 111, 14, 19};

        List<Integer> list = new ArrayList<>();

        list = search(A, B);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


    static ArrayList<Integer> search(int[] a, int[] b) {


        ArrayList<Integer> list = new ArrayList<>();

        for (int i : b) {

            boolean k = binarysearch(a, i);
            if (k != false) {

                list.add(i);
            }
        }

        return list;

    }

    static boolean binarysearch(int[] a, int i) {

        int r = a.length - 1;
        int l = 0;
        while (l <= r) {

            if (i == a[(l + r) / 2]) {
                return false;
            }
            if (i > a[(l + r) / 2]) {
                l = (l + r) / 2 + 1;
            } else {
                r = (l + r) / 2 - 1;
            }

        }
        return true;

    }

}
