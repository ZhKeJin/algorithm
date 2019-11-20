package array;

import sun.rmi.server.InactiveGroupException;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.Serializable;
import java.net.MulticastSocket;
import java.net.StandardSocketOptions;
import java.util.IntSummaryStatistics;

/**
 * @author Zhangkj
 * @date 2019-11-20-15:13
 */

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * <p>
 * 你可以假设数组中不存在重复的元素。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leedcode33 {

    public static void main(String[] args) {

        int[] ints = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(search(ints, 6));
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

//            int mid = start + (end - start) / 2;
            int mid = (start + end) / 2;

            if (target == nums[mid])
                return mid;

            if (nums[mid] > nums[start]) {

                if (target >= nums[start] && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {

                    end = mid - 1;
                }

            }

        }

        return -1;
    }


}
