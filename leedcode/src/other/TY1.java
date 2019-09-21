package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-08-10-10:24
 *
 * 题目描述：
 * TY 字符串 找出 连续的TY  相等的字符串长度
 *
 * 动态规划
 */
public class TY1 {

    public static void main(String[] args) {


        System.out.println(getMaxNum("TYYTYTTYTYTYT"));

    }


    public static int getMaxNum(String ty) {
        int rtn = 0;

        String[] string = ty.split("");

        for (String s : string) {
            System.out.println(s);
        }

        List<String> tyList = new ArrayList<>(Arrays.asList(ty.split("")));

        System.out.println(tyList.size()+"...");

        int length = tyList.size();
        int flag[][] = new int[length][2];
        for (int[] ints : flag) {
            ints[0] = 0;
            ints[1] = 0;
        }

        System.out.println(flag.length);
        System.out.println(flag[1].length);




        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                if ("T".equals(tyList.get(i))) {
                    flag[j][1]++;
                } else if ("Y".equals(tyList.get(i))) {
                    flag[j][0]++;
                }
                if (flag[j][0] == flag[j][1]) {
                    int num = flag[j][0] + flag[j][1];
                    if (num > rtn) {
                        rtn = num;
                    }
                }
            }
        }
        return rtn;
    }



    public int getMaxLen(String str){

        return 0;
    }


}
