package other;

/**
 * @author Zhangkj
 * @date 2019-12-22-23:02
 */

/**
 *  1+2+3+4…..+n
 */
public class Jz64 {





    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }

}
