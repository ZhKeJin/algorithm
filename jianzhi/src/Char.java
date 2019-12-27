import com.sun.javafx.robot.FXRobotImage;

/**
 * @author Zhangkj
 * @date 2019-12-26-22:16
 */
public class Char {


    public static void main(String[] args) {

//
//        int[] ints = new int[]{2,3,4,1,3,4,5,3,2,4,4};
//
//        int search = search(ints);
//
//        System.out.println(search);

        String s = "aaaddafetdsfasdfwedddddddddd";

        int i = search_1(s.toCharArray());

        System.out.println(i);

//        System.out.println(a);


    }

    private static int search(int[] ints) {

        int[] ints1 = new int[10];

        for (int i = 0; i < ints.length; i++) {

            ints1[ints[i]]++;


        }


        int max = ints1[ints[0]];
        for (int i = 1; i < ints1.length; i++) {

            max = Math.max(max, ints1[ints[i]]);

        }

        return max;


    }

    private static int search_1(char[] ints) {

        int[] ints1 = new int[255];

        for (int i = 0; i < ints.length; i++) {

            ints1[ints[i]]++;


        }

        for (int i : ints1) {

            System.out.println(i);
        }



        int max = ints1[ints[0]];
        for (int i = 1; i < ints1.length; i++) {

            max = Math.max(max, ints1[i]);

        }

        return max;
    }

}
