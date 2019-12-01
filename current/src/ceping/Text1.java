package ceping;

/**
 * @author Zhangkj
 * @date 2019-11-25-15:53
 */

import com.sun.deploy.security.TrustRecorder;

import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * 编程题（限时30分钟）
 * 如何判断一个字符串是否为合法的IP地址。
 * 要求：
 * 1. 不能使用正则表达式和自带的库函数。
 * 2. 列出全部测试用例，并给出原因。
 * 3. 把代码的后缀名改成txt后上传，不用压缩。
 */
public class Text1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();


        validIPAddress(string);

    }



        public static String validIPAddress(String IP) {
            //排除空格输入
            if (IP.trim().equals("")) return "Neither";
            //排除最后一个字符是：或者.
            if (IP.substring(IP.length() - 1, IP.length()).equals(":") ||
                    IP.substring(IP.length() - 1, IP.length()).equals(".")) return "Neither";
            String[] strings = IP.split("\\.");
            String[] stringsIPv6 = IP.split("\\:");
            if (strings.length == 4 && stringsIPv6.length != 8) {
                for (String s : strings) {
                    if (s.length() > 3) return "Neither";
                    if (s.length() == 0) return "Neither";
                    char[] chars = s.toCharArray();
                    if (chars.length > 1 && chars[0] == '0') return "Neither";
                    for (char c : chars) {
                        if (c - '0' < 0 || '9' - c < 0) return "Neither";

                    }
                    int change = Integer.parseInt(s);
                    if (change < 0 || change > 255) return "Neither";
                }
                return "IPv4";
            } else if (strings.length != 4 && stringsIPv6.length == 8) {
                int j = 1;
                for (int i = 0; i < stringsIPv6.length; i++) {
                    if (stringsIPv6[i].length() > 4) return "Neither";
                    if (stringsIPv6[i].length() == 0) return "Neither";
                    char[] chars = stringsIPv6[i].toCharArray();
                    for (int k = 0; k < chars.length; k++) {
                        if ((chars[k] - '0' >= 0 && '9' - chars[k] >= 0) || (chars[k] >= 'a' &&
                                chars[k] <= 'f') || (chars[k] >= 'A' && chars[k] <= 'F')) {
                            continue;
                        } else {
                            return "Neither";
                        }
                    }
                }
                return "IPv6";
            }
            return "Neither";
        }


//    public static boolean validIPAddress(String IP) {
//
//        if(IP.trim().equals("")) return false;
//
//        if(IP.substring(IP.length()-1,IP.length()).equals(".")||IP.substring(IP.length()-1,IP.length()).equals(":"))
//            return false;
//        String[] split = IP.split("\\.");
//        String[] splits = IP.split("\\:");
//
//        if(IP.contains(".")){
//             strings = IP.split("\\.");
//            System.out.println(strings.length);
//        }else{
//            strings = IP.split("\\:");
//        }
//
//        for (String string : strings) {
//
//            System.out.println(string);
//
//        }
//
//        return true;
//    }


}
