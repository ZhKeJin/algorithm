package dp;

/**
 * @author Zhangkj
 * @date 2019-12-23-21:10
 */

import javax.crypto.Mac;
import java.time.chrono.MinguoChronology;
import java.util.AbstractMap;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * 买卖股票最好时机
 */


public class Leedcode121 extends AbstractMap {

    public static void main(String[] args) {


        new HashMap<>();

        int[] ints = {7, 1, 5, 3, 6, 4};

        int i = new Leedcode121().maxProfit(ints);

        System.out.println(i);

    }

    public int maxProfit(int[] prices) {

        int[] dp = new int[prices.length];

        dp[prices.length-1] = prices[prices.length-1];
        int max = dp[prices.length-1];
        for (int i = prices.length-2; i >=0 ; i--) {

            System.out.println(prices[i]);
            max = Math.max(prices[i],max);
            dp[i] = max;

        }


        for (int i : dp) {
            System.out.print(i+" ");
        }


        int zmax =0;
        for (int i = 0; i <prices.length; i++) {

            zmax = Math.max(zmax, dp[i]-prices[i]);

        }


        return zmax;


    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
