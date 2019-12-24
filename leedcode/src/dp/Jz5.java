package dp;

/**
 * @author Zhangkj
 * @date 2019-12-23-22:48
 */

import java.util.EventListener;

/**
 * 最长回文子串
 */

public class Jz5 implements EventListener {


    public static void main(String[] args) {

        Jz5 jz5 = new Jz5();

        String s = jz5.longestPalindrome("abc435cba");

        System.out.println(s);

    }

    public String longestPalindrome(String s) {
        if (s.equals(""))
            return "";
        String origin = s;
        String reverse = new StringBuffer(s).reverse().toString(); //字符串倒置
        int length = s.length();
        int[][] arr = new int[length][length];
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++) {
                if (origin.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                }
                if (arr[i][j] > maxLen) {
                    maxLen = arr[i][j];
                    maxEnd = i; //以 i 位置结尾的字符
                }

            }

        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }
}


