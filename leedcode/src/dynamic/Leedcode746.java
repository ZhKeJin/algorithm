package dynamic;

import sun.text.resources.cldr.es.FormatData_es_419;

import java.sql.PseudoColumnUsage;

/**
 * 746. 使用最小花费爬楼梯
 * 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 *
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 *
 * 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 *
 * 示例 1:
 *
 * 输入: cost = [10, 15, 20]
 * 输出: 15
 * 解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
 * @author Zhangkj
 * @date 2019-09-04-23:01
 */
public class Leedcode746 {

    public static void main(String[] args) {
//          int[] cost = {10,15,20,1};
          int[] cost = {0,1,1,0};
//          int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

//        System.out.println(minCostClimbingStairs(cost));
        System.out.println(minCostClimbingStairs_2(cost));
    }

    public static int minCostClimbingStairs_2(int[] cost) {
        if (cost.length == 0) return 0;
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }



    public static int  minCostClimbingStairs(int[] cost) {

        int[] opt = new int[cost.length] ;
        opt[0] = cost[0];
        opt[1] = cost[1];
        opt[2] = Math.min(opt[1],opt[0]+cost[2]);
        opt[1] = Math.min(opt[0],opt[1]);

        for (int i = 3; i < opt.length; i++) {

            int A = opt[i-1];
            int B = opt[i-2]+cost[i];

            opt[i] = Math.min(A,B);

        }

        return opt[cost.length-1];
    }

}
