package array;

import java.util.ArrayList;

/**
 * @author Zhangkj
 * @date 2019-12-22-23:11
 */

/**
 * 连续的数之和
 */
public class FindContinuousSequence {


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new FindContinuousSequence().FindContinuousSequence(100);

        for (ArrayList<Integer> arrayList : arrayLists) {

            for (Integer integer : arrayList) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }


    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        //存放结果
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        //两个起点，相当于动态窗口的两边，根据其窗口内的值的和来确定窗口的位置和大小

        int plow = 1,phigh = 2;

        while(phigh > plow){
            //由于是连续的，差为1的一个序列，那么求和公式是(a0+an)*n/2
            int cur = (phigh + plow) * (phigh - plow + 1) / 2;

            //相等，那么就将窗口范围的所有数添加进结果集
            if(cur == sum){

                ArrayList<Integer> list = new ArrayList<>();
                for(int i=plow;i<=phigh;i++){
                    list.add(i);
                }
                result.add(list);
                plow++;

                //如果当前窗口内的值之和小于sum，那么右边窗口右移一下
            }else if(cur < sum){

                phigh++;

            }else{

                //如果当前窗口内的值之和大于sum，那么左边窗口右移一下
                plow++;
            }

        }

        System.out.println(phigh+" "+plow);
        return result;
    }
}
