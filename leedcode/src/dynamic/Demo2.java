package dynamic;


/**
 * 在 一个数列中 找出是否有数字和等于  指定数  存在返回true 不存在返回 false
 *
 * 例 arr{3,34,4,12,5,2} 找出是否存在数字和 为 9
 *
 * 动态规划：推公式 存在 选 与 不选 利用减法的思想 从后往前进行 遍历 选与不选 加上出口条件
 *
 * subset()
 * @author Zhangkj
 * @date 2019-09-03-18:14
 */
public class Demo2 {

    public static void main(String[] args) {

        int[] arr = {3,34,4,12,5,2};

        System.out.println(subSet(arr, arr.length-1, 100));
//        boolean b = rec_subset(arr, arr.length, 9);

//        System.out.println(dp_subSet(arr,100));

    }


    //递归
    public static boolean subSet(int[] arr,int i,int S){

        if(S==0)
            return true;
        else if(i==0)
            return arr[0]==S;
        else if(arr[i]>S)
            return subSet(arr,i-1,S);
        else{
            boolean A = subSet(arr,i-1,S-arr[i]);
            boolean B = subSet(arr,i-1,S);
            if(A||B) return true;
        }
        return false;
    }



    //非递归
    public static boolean dp_subSet(int[] arr,int S) {

        boolean[][] subset = new boolean[arr.length][S + 1];

        for (int i = 0; i < S + 1; i++) {
            subset[0][i] = false;
        }
        for (int i = 0; i < arr.length; i++) {
            subset[i][0] = true;
        }
        subset[0][arr[0]] = true;
        for (int i = 1; i < arr.length; i++) {
            for (int s = 1; s < S + 1; s++) {
                if (arr[i] > s)
                    subset[i][s] = subset[i - 1][s];
                else {
                    boolean A = subset[i - 1][s - arr[i]];
                    boolean B = subset[i - 1][s];
                    subset[i][s] = A || B;
                }
                //这里只有判断到最后一个数组值才可以 判断可不可以    中途判断不行
//                if(subset[i][s] == true){
//                    System.out.println(i+"...."+s);
//                    return true;
//                }
            }
        }

        return subset[arr.length-1][S];
    }



}
