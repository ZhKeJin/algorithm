package dynamic;

/**
 * @author Zhangkj
 * @date 2019-09-03-17:25
 * <p>
 * 求 数组中 arr {1,2,4,1,7,8,3} 求不相邻数的最大和  用一维数组记录相应的过程信息
 * <p>
 * 推公式 从后往前 把大问题 转化为小问题  动态规划 可用递归（找出口）  也可用非递归
 * <p>
 * 重叠子问题 ： 在递归过程中产生相同的值     overlap 用递归会比较慢 一般用非递归方式
 * <p>
 * 从后往前推公式 opt最佳方案    存在 选 或 不选的问题  两条路径  找到开始 不变的地方
 *
 * 这里找间隔是 1  没有间隔2 3 找 在间隔1 时就包含了其他情况
 *
 */
public class Demo1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 1, 7, 8, 3};

//        int x = fun1(arr,6);
        int x = fun2(arr);

        System.out.println(x);
    }

    //递归 是从后往前 进行递归
    public static int fun1(int[] ar, int i) {

        if (i == 0)
            return ar[0];
        else if (i == 1)
            return Math.max(ar[0], ar[1]);
        else {
            int A = fun1(ar, i - 2) + ar[i];
            int B = fun1(ar, i-1);
            return Math.max(A,B);
        }
    }

    //非递归  这是个一维数组的问题  非递归 用一维数组记录 其中产生的记录 从头往前进行 循环
    public static int fun2(int[] ar){

        int[] opt = new int[ar.length] ;

        opt[0] = ar[0];
        opt[1] = Math.max(ar[0],ar[1]);

        for (int i = 2; i <ar.length; i++) {
             int A = opt[i-2]+ar[i];
             int B = opt[i-1];
             opt[i] = Math.max(A,B);
        }

        return opt[ar.length-1];

    }




}
