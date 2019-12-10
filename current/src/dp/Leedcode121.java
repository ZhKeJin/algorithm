package dp;

/**
 * @author Zhangkj
 * @date 2019-12-07-17:48
 */

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 注意你不能在买入股票前卖出股票。
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，
 * 在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 */
public class Leedcode121 {

    public static void main(String[] args) {
        Leedcode121 leedcode121 = new Leedcode121();

        int[] ints = new int[]{7,1,5,3,6,4};


//        System.out.println(leedcode121.maxProfit(ints));
        System.out.println(leedcode121.maxProfit_1(ints));

    }


    /*
    一次遍历：
    记录最小值，和当前最大的差值
     */


 /*   1 2 3 4
    8 12 16 15
    14 13 9 5
    6 7 11 10

    1234
    5678
    9 10 11 12
    13 14 15 16*/


  /*
  一次遍历：用多个变量
   */
   public int maxProfit_1(int[] prices) {

        int minnum = Integer.MAX_VALUE;
        int maxpro = 0;

       for (int i = 0; i < prices.length; i++) {

           if(prices[i]<minnum){
               minnum = prices[i];
           }
           else if(prices[i]-minnum>maxpro){
               maxpro = prices[i]-minnum;
           }

       }

       return maxpro;
   }




    /*
    涉及到数组的暴力法都以可以解
     */
    public int maxProfit(int[] prices) {

        int max=0;
        for (int i = 0; i < prices.length; i++) {

            for (int j = i+1; j < prices.length; j++) {
                if(prices[i]<prices[j]){

                    max = Math.max(max,prices[j]-prices[i]);

                }
            }

        }

        return max;



    }
}
