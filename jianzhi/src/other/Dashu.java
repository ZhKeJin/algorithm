package other;

import com.sun.xml.internal.messaging.saaj.soap.name.NameImpl;

import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-12-25-18:48
 */

/**
 * 大数相加
 */
public class Dashu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String gethe = new Dashu().gethe(s1, s2);

        System.out.println(gethe);

//        //反转字符串
//        String n1 = new StringBuffer(s1).reverse().toString();
//        String n2 = new StringBuffer(s2).reverse().toString();
//        int l1 = n1.length();
//        int l2 = n2.length();
//        int maxL = l1>l2?l1:l2;
//
//        //补齐0
//        if (l1 < l2) {
//            for (int i = l1; i < l2; i++) {
//                n1 += "0";
//            }
//        }else {
//            for (int i = l2; i < l1; i++) {
//                n2 += "0";
//            }
//        }
//        System.out.println(n1);//test
//        System.out.println(n2);//test
//        StringBuffer res = new StringBuffer();//存放的结果
//        int c = 0;//进位
//
//        for (int i = 0; i < maxL; i++) {
//            int nSum = Integer.parseInt(n1.charAt(i) + "") + Integer.parseInt(n2.charAt(i) + "") + c;
//            System.out.println(n1.charAt(i)+"   "+n2.charAt(i));
//            int ap = nSum%10;
//            res.append(ap);
//            c = nSum/10;
//        }
//        if (c>0) {
//            res.append(c);
//        }
//        //System.out.println(res);//test
//        System.out.println(res.reverse());
    }

    public String gethe(String string1,String string2){

        string1 = new StringBuilder(string1).reverse().toString();

        string2 = new StringBuilder(string2).reverse().toString();


        int len1 = string1.length();
        int len2 = string2.length();

        int maxl = len1>len2 ? len1:len2;


        if(len1<len2){
            for (int i = len1; i < len2; i++) {
                string1+="0";
            }
        }else{
            for (int i = len2; i < len1; i++) {
                string2+="0";
            }

        }

        StringBuilder stringBuilder = new StringBuilder();

        int count =0;

        for (int i = 0; i < maxl; i++) {
            int n = Integer.parseInt(string1.charAt(i)+"")+Integer.parseInt(string2.charAt(i)+"")+count;
            stringBuilder.append(n%10);

            if(n>=10){

                count = n/10;
            }else{
                count =0;
            }

        }

        if(count!=0){
           stringBuilder.append(1);
        }


        return stringBuilder.reverse().toString();
    }


}
