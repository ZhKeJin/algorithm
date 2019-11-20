package array;

/**
 * @author Zhangkj
 * @date 2019-11-19-22:32
 */

/**
 * 在一个长度为n的数组里的所有数字都在 0到 n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
 * 那么对应的输出是第一个重复的数字2。
 */
public class jz2 {

    public static void main(String[] args) {


        int[] ints = new int[]{2, 3, 1, 0, 2, 5, 3};

        int[] duplication = new int[]{};
//        System.out.println(duplicate_1(ints));
        System.out.println(duplicate(ints,ints.length,duplication));
    }


    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length < 1) {
            return false;
        }

        int temp ;
        // 判断输入的是否在[0, number.length-1]之间
        for (int i : numbers) {
            if (i < 0 || i >= numbers.length) {
                return false;
            }
        }

        for (int i = 0; i < numbers.length; i++) {

            while (numbers[i] != i) {

                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                } else {

//                    swap(numbers, i, numbers[i]);
                    temp = numbers[i];
                    numbers[i] = numbers[numbers[i]];
                    numbers[numbers[i]] = temp;
                    System.out.println(i);
                }

            }
        }
        return false;

    }


    public static int duplicate_1(int[] number) {
        if (number == null || number.length < 1) {
            return -1;
        }

        // 判断输入的是否在[0, number.length-1]之间
        for (int i : number) {
            if (i < 0 || i >= number.length) {
                return -1;
            }
        }

        for (int i = 0; i < number.length; i++) {
            // 当number[i]与i不相同的时候一直交换
            while (number[i] != i) {
                // 如果i位置与number[i]位置的数字相同，说明有重复数字
                if (number[i] == number[number[i]]) {
                    return number[i];
                }
                // 如果不同就交换
                else {
                    swap(number, i, number[i]);
                    System.out.println(i);
                }
            }
        }
        return -1;
    }

    private static void swap(int[] data, int x, int y) {
        int tmp = data[x];
        data[x] = data[y];
        data[y] = tmp;
    }
}


