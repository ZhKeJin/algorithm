/**
 * @author Zhangkj
 * @date 2019-07-30-17:49
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 *
 * 示例:
 *
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 *
 * 来源：力扣（LeetCode）
 */
public class IPAddresses93 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        restoreIpAddresses(string);

    }


    public static List<String> restoreIpAddresses(String s) {

        int[] ints = new int[4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                ints[i] = Integer.parseInt(s.substring(0,++i));
                if(s.length()-1>10)
                    continue;
            }
        }



        List<String> list = new LinkedList<>();

        return  list;
    }


}
