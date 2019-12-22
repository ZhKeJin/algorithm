package other;

import com.sun.media.sound.SoftTuning;
import com.sun.prism.ReadbackRenderTarget;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Zhangkj
 * @date 2019-12-21-17:57
 */
public class Jiaohuan {


    public static void main(String[] args) {
        Jiaohuan jiaohuan = new Jiaohuan();

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8,9};
        jiaohuan.indexK(ints,2);

        System.out.println(Arrays.toString(ints));


        String str= "abcdefgh";

        String s;
        s = jiaohuan.indexK_1(str, 2);

        System.out.println(s);

//        AtomicInteger;



    }

    public String indexK_1(String str,int k){

        int r = str.length()-1;
        int l =0;

        //交换
       // char[] chars = string.toCharArray();

//        String s = swap_1(string, l, r);
//        System.out.println(s);
//        String s1 = swap_1(s, l, r - k);
//        System.out.println(s);
//        String s2 = swap_1(s, r - k + 1, r);
//        System.out.println(s);
//
//        return s1+s2;
        str= new StringBuffer(str).reverse().toString();
        StringBuffer str1 = new StringBuffer(str.substring(0, str.length() - k)).reverse();
        StringBuffer reverse = new StringBuffer(str.substring(str.length() - k)).reverse();
        return str1.toString()+reverse.toString();


    }


    private String swap_1(String arr, int l, int r) {

        String result = "";
        for (int i = l; i <= r; i++) {

            result=arr.charAt(i)+result;

        }

        return result;


    }



    public void indexK(int[] arr,int k){

        int r = arr.length-1;
        int l =0;

        //交换

        swap(arr,l,r);
        swap(arr,l,r-k);
        swap(arr,r-k+1,r);


        ArrayList<Integer> objects = new ArrayList<>();

        Collections.reverse(objects);

        Collections.sort(objects);

//        List<Integer> ints = (List<Integer>) Arrays.asList(arr);
//        Collections.sort(ints);

    }

    private void swap(int[] arr, int l, int r) {

        for (int i = l; i <= (l+r)/2; i++) {

            int t = arr[l];
            arr[l] = arr[r];
            arr[r] =  t;
            l++;
            r--;
        }

    }




}
