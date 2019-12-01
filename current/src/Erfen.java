import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import javax.sound.midi.MidiChannel;
import java.time.chrono.MinguoChronology;

/**
 * @author Zhangkj
 * @date 2019-11-20-16:22
 */
public class Erfen {

    public static void main(String[] args) {

        int[] ints = {3, 4, 5, 6, 7, 8, 9, 10};

//        System.out.println(erfen(ints, 5));
        System.out.println(erfen_1(ints, 11));
        System.out.println(erfen_3(ints, 5));

    }



    static int erfen_3(int[] arr, int x) {

        int i=0,j=arr.length-1;
        int mid = -1;

        while(i<=j){

            mid = (i+j)/2;
            System.out.println(mid);
            if(arr[mid]>x){
                j = mid -1;
            }else if(arr[mid]<x){
                i = mid + 1;
            }else{
                return mid;
            }
        }



        return -1;
    }





    static int erfen_1(int[] arr, int x) {

        return fun(0, arr.length - 1, x, arr);

    }

    static int fun(int l, int r, int x, int[] arr) {

        if(l>r){
            return -1;

        }
        if (arr[(l + r) / 2] == x)
            return (l + r) / 2;


        if (x > arr[(l + r) / 2])
            return fun((l + r) / 2 + 1, r, x, arr);
        else
            return fun(l, (l + r) / 2 - 1, x, arr);

    }

}


