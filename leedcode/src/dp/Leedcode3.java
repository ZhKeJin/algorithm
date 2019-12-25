package dp;

/**
 * @author Zhangkj
 * @date 2019-12-25-22:13
 */

import java.util.HashMap;
import java.util.Map;

/**
 *  无重复字符的最长子串
 */


public class Leedcode3 {

    public int lengthOfLongestSubstring(String s) {

        int right = 0;
        int left = 0;

        HashMap<Character, Integer> window = new HashMap<>();

        int maxlen =0;
        while(right<s.length()){

            Character character = s.charAt(right);
            window.put(character,window.getOrDefault(character,0)+1);

            right++;

            while(window.get(character)>1){

//                window.put(character,window.getOrDefault(character,1));
                char char1 = s.charAt(left);

                window.put(char1,window.get(char1)-1);

                left++;


            }

            maxlen = Math.max(maxlen,right-left);



        }

        return maxlen;
    }

}
