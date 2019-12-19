package other;

/**
 * @author Zhangkj
 * @date 2019-12-19-13:36
 */

/**
 *  1+2+3+4…..+n    只用递归
 */
public class Jz65 {



    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }

}
