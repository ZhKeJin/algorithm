package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zhangkj
 * @date 2019-12-25-21:13
 */


/**
 * 76. 最小覆盖子串
 * 输入: S = "ADOBECODEBANC", T = "ABC"
 * 输出: "BANC"
 */
public class Leedcode76 {


    public static void main(String[] args) {

//        new Leedcode76().minWindow("ebbancf","aabc");
        List<Integer> anagrams = new Leedcode76().findAnagrams("baa", "aa");



    }

    public String minWindow(String s, String t) {

//        HashMap<Character, Integer> need = new HashMap<>();
//
//        for (int i = 0; i < t.length(); i++) {
//
//            int count = need.getOrDefault(t.charAt(i),0);
//            need.put(t.charAt(i),count);
//        }
//
//        System.out.println(need.size());
//
//
//        return null;

        int start = 0, minLen = Integer.MAX_VALUE;
        int left = 0, right = 0;

        Map<Character,Integer> window = new HashMap<Character,Integer>();
        Map<Character,Integer> needs = new HashMap<Character,Integer>();
        for(char c:t.toCharArray()){
            needs.put(c,needs.getOrDefault(c,0)+1);

        }

        int match = 0;

        while(right < s.length()){
            char c1 = s.charAt(right);

            if(needs.containsKey(c1)){
                window.put(c1,window.getOrDefault(c1,0)+1);
                if(needs.get(c1).equals(window.get(c1))){
                    match++;
                }
            }
            right++;

            while(match == needs.size()){

                if(right - left < minLen){
                    // 更新最小子串的位置和长度
                    start = left;
                    minLen = right - left;
                }
                char c2 = s.charAt(left);
                if (needs.containsKey(c2)) {
                    window.put(c2,window.get(c2)-1);
                    if (window.get(c2) < needs.get(c2)){
                        match--;
                    }
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start, start+minLen);



    }


    public List<Integer> findAnagrams(String s, String p) {
        int start = 0, minLen = Integer.MAX_VALUE;
        int left = 0, right = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();


        Map<Character,Integer> window = new HashMap<Character,Integer>();
        Map<Character,Integer> needs = new HashMap<Character,Integer>();
        for(char c:p.toCharArray()){
            needs.put(c,needs.getOrDefault(c,0)+1);

        }

        int match = 0;

        while(right < s.length()){
            char c1 = s.charAt(right);

            if(needs.containsKey(c1)){
                window.put(c1,window.getOrDefault(c1,0)+1);
                if(needs.get(c1).equals(window.get(c1))){
                    match++;
                }
            }
            right++;

            while(match == needs.size()){

                if(right - left == needs.size()){

                    arrayList.add(left);

                    // 更新最小子串的位置和长度
//                    start = left;
//                    minLen = right - left;
                }
                char c2 = s.charAt(left);
                if (needs.containsKey(c2)) {
                    window.put(c2,window.get(c2)-1);
                    if (window.get(c2) < needs.get(c2)){
                        match--;
                    }
                }
                left++;
            }
        }
        return arrayList;
    }




}
