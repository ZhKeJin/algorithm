package array;

/**
 * @author Zhangkj
 * @date 2019-12-15-11:39
 */

/**
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为 8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Jz42 {

    public static void main(String[] args) {
        int sum = new Jz42().FindGreatestSumOfSubArray(new int[]{1,-2,3,10,-4,7,2,-5});

        System.out.println(sum);

    }


    public int FindGreatestSumOfSubArray(int[] array) {

        int[] dp  = new int[array.length];

        dp[0] = array[0];

        for (int i = 1; i < array.length; i++) {

            if(dp[i-1]<0){dp[i] = array[i];}
            else if(dp[i-1]+array[i]>=0){
                dp[i] = dp[i-1]+array[i];
            }else{
                dp[i] = array[i];
            }
        }

        int max=0;
        for (int i = 1; i < dp.length; i++) {
            System.out.println(dp[i]);
             max = Math.max(max, dp[i]);
        }

        return max;

    }



}
