package array;

/**
 * @author Zhangkj
 * @date 2019-11-11-14:38
 */

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * <p>
 * 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leedcode26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        //removeDuplicates(nums);
        System.out.println(removeDuplicates_1(nums));

        for (int num : nums) {

            System.out.println(nums[num]+"  "+num);
        }

    }

    public static int removeDuplicates(int[] nums) {


        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if(j==nums.length-1) return i;
                if (nums[i] == nums[j]) {
                    continue;
                }

                if (j - i == 1) {
                    break;
                } else {
                    for (int k = 0; k < j - i && (j+k) < nums.length; k++) {
                        int temp = nums[j+k];
                        nums[j+k] = nums[i + k+1];
                        nums[i + k+1] = temp;
                    }
                }

            }
        }
        return 0;
    }


    public static int removeDuplicates_1(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

//
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//
//            if (nums[i] != nums[j]) {
//
//                i++;
//                nums[i] = nums[j];
//
//            }
//
//        }
//        return i + 1;
    }

}
