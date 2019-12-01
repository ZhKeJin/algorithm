package array;

/**
 * @author Zhangkj
 * @date 2019-11-27-19:01
 */

/**
 * 找出数组中的第二大的元素
 */
public class Demo3 {

    public static void main(String[] args) {

        int[] ints = new int[]{2,3,5,6,2,5,4,65};

        System.out.println(findNum(ints));

    }

    private static int findNum(int[] ints) {

        int max = ints[0];
        int secNum = Integer.MIN_VALUE;

        for (int i = 1; i < ints.length; i++) {
            if(ints[i]>max){
                secNum = max;
                max = ints[i];
            }else if(ints[i]<max&&ints[i]>secNum){
                secNum = ints[i];
            }

        }
        return secNum;
    }


}
