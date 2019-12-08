package jzoffer;

/**
 * @author Zhangkj
 * @date 2019-12-08-19:37
 */
public class JZFirstNotRepeatingChar {

    public static void main(String[] args) {
        String string = "asdfasfsaf";
        int[] ints = new int[100];
        char a = 'a';
        char b = 97;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println();
//        ints['a'] =1;
//        System.out.println(ints['a']);


        int qwertyuiopasdfdfghfghj = new JZFirstNotRepeatingChar().FirstNotRepeatingChar("qwertyuiopasdfdfghfghj");


        System.out.println(qwertyuiopasdfdfghfghj);

    }

    /*
    建立hash 表
     */
    public int FirstNotRepeatingChar(String str) {


        int[] ints = new int[255];

        for (int i = 0; i < str.length(); i++) {
            //char a = str.charAt(i);
            ints[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(ints[str.charAt(i)]==1){
                return i;
            }
        }


        return -1;

    }



}
