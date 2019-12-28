package dp;

import javax.swing.*;
import java.util.Arrays;

/**
 * @author Zhangkj
 * @date 2019-12-27-22:41
 */

/**
 * 673. 最长递增子序列的个数
 */
public class Leedcode637 {

    public int findNumberOfLIS_1(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = 1;

        for(int i=1; i<nums.length; i++){


            for(int j=i-1 ;j>=0; j--){

                if(nums[j]<nums[i]){


                    dp[i] = dp[j]+1;
                    break;
                }

            }

//            if(j<0){
//                dp[i] =1;
//            }
        }

        int max = dp[0];
        for (int l = 1; l < dp.length; l++) {
//            if(max ==)
        }

        return 0;
    }


    public int findNumberOfLIS(int[] nums) {
        int N = nums.length;
        if (N <= 1) return N;
        int[] lengths = new int[N]; //lengths[i] = length of longest ending in nums[i]
        int[] counts = new int[N]; //count[i] = number of longest ending in nums[i]
        Arrays.fill(counts, 1);

        for (int j = 0; j < N; ++j) {
            for (int i = 0; i < j; ++i) if (nums[i] < nums[j]) {
                if (lengths[i] >= lengths[j]) {
                    lengths[j] = lengths[i] + 1;
                    counts[j] = counts[i];
                } else if (lengths[i] + 1 == lengths[j]) {
                    counts[j] += counts[i];
                }
            }
        }

        int longest = 0, ans = 0;
        for (int length: lengths) {
            longest = Math.max(longest, length);
        }
        for (int i = 0; i < N; ++i) {
            if (lengths[i] == longest) {
                ans += counts[i];
            }
        }
        return ans;
    }



}
