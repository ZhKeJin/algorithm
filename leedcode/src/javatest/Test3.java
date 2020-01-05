package javatest;

import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2020-01-05-18:02
 */
public class Test3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int len=0;
        String[] str=new String[100];
        while(in.hasNext())
        {
            String a=in.nextLine();
            if(a.equals("end")) break;
            str[len]=a;
            len++;
        }

        String s1 = in.nextLine();
        String s2 = in.nextLine();
        for(int j=0;j<len;j++)
            System.out.println(str[j].replace(s1, s2));
        in.close();
    }
}
