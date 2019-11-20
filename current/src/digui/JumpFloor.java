package digui;

/**
 * @author Zhangkj
 * @date 2019-11-19-10:53
 */

/**
 * 变态爬楼梯
 */
public class JumpFloor {

    public static void main(String[] args) {
        //System.out.println(JumpFloorII(5));
    }

    public static void JumpFloorII(int target) {

        int[] dp = new int[target];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < 5; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }


    }
}
