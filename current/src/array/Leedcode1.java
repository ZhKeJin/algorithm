package array;

import sun.nio.cs.ext.MacUkraine;

import java.util.HashMap;

/**
 * @author Zhangkj
 * @date 2019-11-20-17:02
 */
public class Leedcode1 {

    public static void main(String[] args) {

        int[] ints = {2, 7, 11, 15};

        int[] ints1;
        ints1 = twoSum(ints, 10);

        for (int i : ints1) {

            System.out.println(i);
        }

    }

    /**
     * 利用hash表
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            integerIntegerHashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];
            if (integerIntegerHashMap.containsKey(temp) && integerIntegerHashMap.get(temp) != i) {
                return new int[]{i, integerIntegerHashMap.get(temp)};
            }
        }

        return null;

    }

    public static int[] twoSum_1(int[] nums, int target) {

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];
            if (integerIntegerHashMap.containsKey(temp)) {
                return new int[]{i, integerIntegerHashMap.get(temp)};
            }
            integerIntegerHashMap.put(nums[i], i);
        }

        return null;

    }

}
