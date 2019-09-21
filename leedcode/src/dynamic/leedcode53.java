package dynamic;


import java.util.Arrays;

/**
 * 最大子序列和
 *
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 *
 * @author Zhangkj
 * @date 2019-09-03-9:34
 */


public class leedcode53 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

//        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray_2(arr));
    }



    public static int maxSubArray(int[] nums){

        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static int maxSubArray_2(int[] nums) {
        int dp[] = new int[nums.length];

        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(dp[i-1] >=0 )
                dp[i] = dp[i-1]+nums[i];
            else
                dp[i] = nums[i];
        }
        Arrays.sort(dp);

        return dp[dp.length-1];
    }
}
