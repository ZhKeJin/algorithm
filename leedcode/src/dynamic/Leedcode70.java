package dynamic;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 *
 */
public class Leedcode70 {

    public static void main(String[] args) {

        System.out.println(climbStairs(3));
        System.out.println(faca(3));
    }


    //动态规划方式
    public static int climbStairs(int n) {

        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];   //动态方程
        }

        return dp[n];

    }

    //斐波那契数列
    /*
     1 2 3 5 8
     1 2 3 4 5   后面的数等于前两个相加
     */
    public static int faca(int n){
        int first = 1;
        int second = 2;
        int x=0;

        for (int i = 3; i <= n ; i++) {

            x = first + second;

            first = second;
            second = x;
        }

        return x;
    }

}
