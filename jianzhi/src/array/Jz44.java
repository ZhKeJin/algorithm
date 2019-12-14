package array;

/**
 * @author Zhangkj
 * @date 2019-12-14-21:25
 */

/**
 *数字序列中的某一位数字
 */
public class Jz44 {

    public static void main(String[] args) {
        method(6);
    }



    private static int method(int n) {
        if (n < 0) {
            return -1;
        }
        if (n < 11) {
            return n - 1;
        }

        int Byte = n;
        int X = 1;
        double tmp = 10;// 只有一位的数字共占 10 位
        while (Byte - tmp > 0) {
            ++X;
            Byte -= tmp;
            // 只有 X 位所有数字在序列中共占 (Math.pow(10, X) - Math.pow(10, X - 1)) * X 位
            tmp = (Math.pow(10, X) - Math.pow(10, X - 1)) * X;
        }

        // 求出 n 对应的是几位数，假设 X 为 2，则是 n 处于两位数的序列中
        // 而两位数是从 10 开始
        double base = Math.pow(10, X - 1);

        // 求出在两位数序列中的第 Y 个序列位，
        // 比如 n = 19 时， X 位 2，即第 n 位是位于两位数的序列中，即在 101112131415... 中
        // 此时 Byte 位 9，表示是 101112131415... 的第九位
        // 但是不能直接求出，因此要求出第 9 位对应的序列数，即 (9/(X = 2)) 结果为 4，余 1
        // 即对应 10+4 = 14 的第 1 位（第 0 位为 1，第 1 位为 4）
        int Y = Byte  / X;
        int index = Byte % X;
        double number = base + Y;

        // 这一步就是求出序列数 14 的第 1 位，即用 14 / 10，使 4 处于个位，再取余即可
        int result = (int) ((number / Math.pow(10, X - index - 1)) % 10);
        return result;
    }


}
