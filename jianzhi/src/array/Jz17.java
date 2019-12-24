package array;

/**
 * @author Zhangkj
 * @date 2019-12-24-15:40
 */

/**
 *  打印  N 位数
 */
public class Jz17 {

    // 数字排列方法
    public static void maxOfND(int n) {
        if (n < 0) {
            return;
        }
        char[] num = new char[n];
        for (int i = 0; i < 10; i++) {
            num[0] = (char) (i + '0');
            printNumRec(num, n, 0);
        }
    }

    // 递归部分
    public static void printNumRec(char[] num, int n, int index) {
        if (index == n - 1) {
            printNum(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            num[index + 1] = (char) (i + '0');
            printNumRec(num, n, index + 1);
        }
    }

    // 以阅读习惯输出
    public static void printNum(char[] num) {
        boolean isBegin0 = true;
        for (int i = 0; i < num.length; i++) {
            if (isBegin0 && num[i] != '0') {
                isBegin0 = false;
            }
            if (!isBegin0) {
                System.out.print(num[i]);
            }
        }
        System.out.println();
    }

    // 测试
    public static void main(String[] args) {
        maxOfND(5);
    }

}
