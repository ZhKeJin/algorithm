package other;

/**
 * @author Zhangkj
 * @date 2019-12-19-13:39
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 减绳子
 */

/**
 * 链接：https://www.nowcoder.com/questionTerminal/57d85990ba5b440ab888fc72b0751bf8?f=discussion
 * 来源：牛客网
 *
 * 题目分析：
 *  * 先举几个例子，可以看出规律来。
 *  * 4 ： 2*2
 *  * 5 ： 2*3
 *  * 6 ： 3*3
 *  * 7 ： 2*2*3 或者4*3
 *  * 8 ： 2*3*3
 *  * 9 ： 3*3*3
 *  * 10：2*2*3*3 或者4*3*3
 *  * 11：2*3*3*3
 *  * 12：3*3*3*3
 *  * 13：2*2*3*3*3 或者4*3*3*3
 */
public class Jz14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(cutRope(n));
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public int cutRope_1(int n) {
        // n<=3的情况，m>1必须要分段，例如：3必须分成1、2；1、1、1 ，n=3最大分段乘积是2,
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int[] dp = new int[n+1];
        /*
        下面3行是n>=4的情况，跟n<=3不同，4可以分很多段，比如分成1、3，
        这里的3可以不需要再分了，因为3分段最大才2，不分就是3。记录最大的。
         */
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        int res=0;//记录最大的
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <=i/2 ; j++) {
                res=Math.max(res,dp[j]*dp[i-j]);
            }
            dp[i]=res;
        }
        return dp[n];
    }


    public static int cutRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n % 3 == 1) {
            int k = n / 3 - 1;
            return (int)Math.pow(3, k) * 2 * 2;
        }
        if (n % 3 == 2) {
            int k = n / 3;
            return (int)Math.pow(3, k) * 2;
        }
        return (int)Math.pow(3, n / 3);
    }


}
