import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.awt.font.NumericShaper;
import java.util.*;

/**
 * @author Zhangkj
 * @date 2019-08-10-11:14
 * <p>
 * 逐个分隔字符串。split("")；里面是空，不是空格。
 */
public class Leedcode35 {


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String string1 = scanner.nextLine();
//
//        String string = string1.substring(0, string1.length() - 2);
//
//        int a = string1.lastIndexOf(',');
//
//        int x = Integer.parseInt(string1.substring(string1.lastIndexOf(',') + 1), string1.length());
//
//        System.out.println(x);
//        System.out.println(a);
//
//
//
//
//
//        List<String> list = Arrays.asList(string.substring(1, string.length() - 1).split(","));
//
//
//        int i1 = (int) Collections.binarySearch(list, 5 + "");
//
//
//        int i = Arrays.binarySearch(string.substring(1, string.length() - 1).split(","), x + "");
//
//        if (i < 0) i = Math.abs(i + 1);
//
//        System.out.println(i);

        int[] nums = new int[]{1, 3, 5, 6};




        searchInsert(nums, 7);
    }


    public static int searchInsert(int[] nums, int target) {

        int i = Arrays.binarySearch(nums,target);

        if (i < 0) i = Math.abs(i + 1);

        System.out.println(i);

        return 0;
    }


}
