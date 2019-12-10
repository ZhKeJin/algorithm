package dp;


import sun.print.SunMinMaxPage;

import java.net.Socket;
import java.util.concurrent.DelayQueue;

/**
 * @author Zhangkj
 * @date 2019-12-07-16:02
 */

/**
 *  cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * 输出: 6
 * 解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
 *
 */
public class Leedcode746 {


    public static void main(String[] args) {

        Leedcode746 leedcode746 = new Leedcode746();

        int[] ints = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 1, 1};
//        int[] ints = new int[]{0,0,1,1};
//        System.out.println(leedcode746.minCostClimbingStairs(ints));
        System.out.println(leedcode746.minCostClimbingStairs_1(ints));


        System.out.println(getnum(5));



    }



    public int minCostClimbingStairs_1(int[] cost) {

        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {

            dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];

        }

        return Math.min(dp[cost.length-1],dp[cost.length-2]);



    }


    private static int getnum(int i) {

        if(i==1||i==2){
            return i;
        }

        return getnum(i-1)+getnum(i-2);

    }


    public int minCostClimbingStairs(int[] cost) {

        int length = cost.length-1;




        return getmin(length,cost);
    }


    private int getmin(int i,int[] cost) {
        if(i==0){
            return cost[0];
        }

        if(i==1){
            return Math.min(cost[0],cost[1]);
        }

        if(i==cost.length-1){

            return Math.min(getmin(i-1,cost),getmin(i-2,cost)+cost[i]);
        }

        return Math.min(getmin(i-1,cost),getmin(i-2,cost)+cost[i]);


    }


}
