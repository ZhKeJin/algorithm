package array;

/**
 * @author Zhangkj
 * @date 2019-12-14-21:33
 */

import com.sun.xml.internal.fastinfoset.tools.TransformInputOutput;

import java.util.function.DoublePredicate;

/**
 * 不重复的子串
 */

public class Jz48 {

    public static void main(String[] args) {

        System.out.println(getsubstr("qwertyuiopqasdfghjklzxcvbnm"));
        System.out.println(getsubstr_1("qwertyuiopqasdfghjklzxcvbnm"));

    }


    static  int  getsubstr(String str){

        int[] dp = new int[str.length()];

        dp[0] = 1;

        for (int i = 1; i < str.length(); i++) {


                int x = dp[i-1];
                while(x!=0){
                    if(str.charAt(i)!=str.charAt(i-x)){
                        x--;
                    }else{
                        break;
                    }
                }

                if(x==0){
                    dp[i] = dp[i-1] + 1;
                }else if(x==dp[i-1]){
                    dp[i] = dp[i-1];
                }else{
                    dp[i] = i-x;
                }

        }

        int max=dp[0];
        for (int i = 1; i < dp.length; i++) {

            //System.out.println(dp[i]);
            max = Math.max(max,dp[i]);
        }

        return max;

    }


    static  int  getsubstr_1(String str){

        int[] dp = new int[str.length()];


        dp[0] = 1;

        for (int i = 1; i < str.length(); i++) {

            int index = dp[i-1];
            while(index!=0){
                if(str.charAt(i)==str.charAt(i-index))
                    break;
                index--;
            }

            if(index==dp[i-1]){
                dp[i] = dp[i-1];
            }else if(index == 0){
                dp[i] = dp[i-1]+1;
            }else{
                dp[i] = index;
            }

        }
        int max=dp[0];
        for (int i = 1; i < dp.length; i++) {

            //System.out.println(dp[i]);
            max = Math.max(max,dp[i]);
        }

        return max;


    }





//    static  int  getsubstr_1(String str){
//
//        int[] dp = new int[str.length()];
//
//        dp[0] = 1;
//
//        for (int i = 1; i < str.length(); i++) {
//
//
//            int x = dp[i-1];
//
//            for()
//
//            if(x==0){
//                dp[i] = dp[i-1] + 1;
//            }else if(x==dp[i-1]){
//                dp[i] = dp[i-1];
//            }else{
//                dp[i-1] = i-x;
//            }
//
//        }
//
//        int max=dp[0];
//        for (int i = 1; i < dp.length; i++) {
//
//            System.out.println(dp[i]);
//            max = Math.max(max,dp[i]);
//        }
//
//        return max;
//
//    }

}
