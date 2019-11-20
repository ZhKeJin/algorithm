import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.time.chrono.MinguoChronology;

/**
 * @author Zhangkj
 * @date 2019-11-20-16:22
 */
public class Erfen {

    public static void main(String[] args) {

        int[] ints = {3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(erfen(ints, 5));
        System.out.println(erfen_1(ints, 5));

    }

    static int erfen(int[] arr, int x) {

        int end = arr.length - 1;
        int start = 0;

        while (start <= end) {

            int mid = (end + start) / 2;

            if (x == arr[mid])
                return mid;

            if (x > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }

        return -1;


    }

    static int erfen_1(int[] arr, int x) {

        return fun(0, arr.length - 1, x, arr);

    }

    static int fun(int l, int r, int x, int[] arr) {

        if (arr[(l + r) / 2] == x)
            return (l + r) / 2;


        if (x > arr[(l + r) / 2])
            return fun((l + r) / 2 + 1, r, x, arr);
        else
            return fun(l, (l + r) / 2 - 1, x, arr);

    }

}


