package array;

/**
 * @author Zhangkj
 * @date 2019-12-14-22:29
 */


import java.util.*;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Jz38 {



    public static void main(String[] args) {

        int s = (int) (2+Math.random()*(9-2+1));
        System.out.println(s);

        ArrayList<String> abc = new Jz38().Permutation("aac");

        for (String string : abc) {
            System.out.println(string);
        }
    }

    public ArrayList<String> Permutation(String str) {

        ArrayList<String> list = new ArrayList<String>();
        if(str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }


    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        if(i == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
          //  Set<Character> charSet = new HashSet<Character>();
            for(int j=i;j<chars.length;++j){
            //    if(!charSet.contains(chars[j])){
              //      charSet.add(chars[j]);
                    swap(chars,i,j);
                    PermutationHelper(chars,i+1,list);
                    swap(chars,j,i);
                //}
            }
        }
    }

    private void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }


    public ArrayList<String> Permutation_1(String str) {

        ArrayList<String> list = new ArrayList<>();


        helpper(str.toCharArray(),0,list);

        return list;

    }

    private void helpper(char[] str, int i, ArrayList<String> list) {


        if(i==str.length-1){
            list.add(str.toString());
        }

        for (int j = i; j <str.length-1; j++) {

            HashSet<Character> characters = new HashSet<>();

            if(!characters.contains(str[i])){

                swap(str,i,j);

                helpper(str,i+1,list);
                swap(str,j,i);

            }

        }


    }


}
