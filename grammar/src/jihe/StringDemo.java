package jihe;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Zhangkj
 * @date 2019-07-26-11:35
 */
public class StringDemo {

    public static void main(String[] args) {

        char[] arr = {'1','2','3'};


        System.out.println(toTrim("    hello  world   "));

        System.out.println(reverse("qwertyuio"));

        System.out.println(getCount("abkkcadkkefkkskk"));


        System.out.println("————————————");
        getSub("abcwerthelloyuiodef","hello");
        getSub_2("abcwerthelloyuiodef","hello");
        System.out.println("————————————");


        char ar = 'a';
        System.out.println(ar);

        char ae  = '\u5c0f';
        System.out.print(ae);

        System.out.println("————————————");


        int[] array = getArr("2 5 4 7 5 7 6 4 44");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }
/*
    "12 0 99 -7 30 4 100 13"
    要求对字符串中的数值进行排序。生成一个数值从小到大新字符串。

            "-7 0 4 12 13 30 99 100"

    思路：
            1，将字符串切割。变成字符串数组。
            2，将字符串数组转成int数组。
            3，int数组排序。
            4，将int数组变成字符串。
    */


    public static int[] getArr(String ar){

        int[] ints = new int[ar.length()];

        String[] str = ar.split(" ");
        for (int i = 0; i < str.length; i++) {
             ints[i] = Integer.parseInt(str[i]);

        }

        Arrays.sort(ints);

        return ints;

    }




    //方法二：求一个字符串的子串
    public static String getSub_2(String str1,String str){

        String max = "",min = "";
        max = str1.length()>str.length()?str1:str;
        min = (str1==max)?str:str1;


        StringBuffer sb  =  new StringBuffer();

        int len =min.length();

        for (int i = 0; i < len; i++) {
            for (int y = 0,z=len-i; z!=len+1; y++,z++) {

                System.out.println(min.substring(y,z));
                String temp = min.substring(y,z);
                if(max.contains(temp)){
                    return temp;
                }

            }
        }


        return "";

    }

    //方法一：求一个字符串的所有子串
    public static void getSub(String str1,String str){

        int fin = str.length();
        int ind = 0,fina;

        for (int i = 0; i < fin; i++) {
            for (int j = 0; j < fin; j++) {
                fina = fin-i+j;
                if(fina<fin+1){
                    System.out.println(str.substring(j,fina));
                    /*if(str1.contains(str.substring(j,fina))==true){
                        System.out.println("sub......."+str.substring(j,fina));
                        return ;
                    }*/
                }
            }
        }


    }


    /*
    3，获取一个字符串在另一个字符串中出现的次数。
        "abkkcdkkefkkskk"


        思路：
        1，定义个计数器。
        2，获取kk第一次出现的位置。
        3，从第一次出现位置后剩余的字符串中继续获取kk出现的位置。
            每获取一次就计数一次。
        4，当获取不到时，计数完成。
    */
    public static int getCount(String str){

        int count=0;
        int index = 0;


        /*while(str.indexOf("kk",index)!=-1){

            count++;

            index = str.indexOf("kk",index)+2;
        }

        return count;*/

        //方法二
        while((index=str.indexOf("kk"))!=-1){

            count++;
            str = str.substring(index+2);

        }


        return count;
    }




    //字符串翻转
    public static String reverse(String s){

        char[] chars = s.toCharArray();

        int len = chars.length;
        for(int i=0;i<len/2;i++){

            char cha = chars[i];
            chars[i] = chars[len-i-1];
            chars[len-i-1] = cha;

        }

        return s.valueOf(chars);

    }



    //去除字符串两边的空格
    public static String toTrim(String string){

        if(string.indexOf("he")!=-1){
            System.out.println(string.indexOf("he"));
        }

        System.out.println(string.toUpperCase());

        int pos = string.length();
        int str = 0;

        while(string.charAt(str) == ' '){
            str++;
        }

        while(string.charAt(pos-1) == ' '){
            pos--;
        }



       /* char[] arr = string.toCharArray();
        while(arr[str] == ' '){
            str++;
        }
        while(arr[pos-1] == ' '){

             pos--;
        }*/

        return string.substring(str,pos);


    }





}
