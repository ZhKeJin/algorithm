package array;

import sun.nio.cs.ext.MacUkraine;

import java.util.HashMap;

/**
 * @author Zhangkj
 * @date 2019-11-20-17:02
 */

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
