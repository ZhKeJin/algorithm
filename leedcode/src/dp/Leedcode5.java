package dp;

/**
 * @author Zhangkj
 * @date 2019-12-26-14:23
 */

/**
 * 最长回文子串
 */
public class Leedcode5 {

    public static void main(String[] args) {

        Leedcode5 leedcode5 = new Leedcode5();

        String s = leedcode5.longestPalindrome("abc435cba");

        System.out.println(s);


        System.out.println("...................");


        String string = leedcode5.getString("ababcdefacb", "acaabcdefcab");

        System.out.println(string);

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




    public String getString(String s1,String s2){

        int[][] ints = new int[s1.length()][s2.length()];

        int maxlen =0;
        int maxindex = 0;

        for (int i = 0; i < s1.length(); i++) {

            for (int j = 0; j < s2.length(); j++) {

                if(s1.charAt(i) == s2.charAt(j)){

                    if(i==0 || j==0){

                        ints[i][j] = 1;
                    }else{

                        ints[i][j] = ints[i-1][j-1]+1;

//                        maxlen = Math.max(ints[i][j],maxlen);
//
//                        maxindex = i;
                    }
                }

                if(ints[i][j]>maxlen){
                    maxlen = ints[i][j];
                    maxindex = i;
                }

            }

        }

        return s1.substring(maxindex-maxlen+1,maxindex+1);



    }




}
