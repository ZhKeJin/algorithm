package array;

/**
 * @author Zhangkj
 * @date 2019-11-27-20:56
 */

/**
 * 找出数组中最短的连续的子数组，>=target
 */
public class Demo4 {


    public static void main(String[] args) {

        int[] ints = new int[]{2,3,1,2,4,3};

        int arr = findzi(ints,7);
//        int arr1 = minSubArr(ints,5);
        System.out.println(arr);
    }

    private static int findzi(int[] ints, int target) {

        int i=0;
        int j=-1;
        int sum=0,res=ints.length+1;

        while(i<ints.length){

            if(sum<target && (j+1)<ints.length){
                j++;
                sum+=ints[j];
            }else{
                sum-=ints[i];
                i++;
            }

            if (sum >= target) {
                res = min(res, j - i + 1);
            }
            System.out.println(res);
        }

        if(res == ints.length + 1)
            return 0;
        return res;

    }

    public static int minSubArr(int[] nums, int s) {
        int l = 0, r = -1; //nums[l...r]是我们的滑动窗口
        int sum = 0;
        int res = nums.length + 1;

        while (l < nums.length) { //左边界 < 长度
            if (r + 1 < nums.length && sum < s) { //当前窗口的和 <s
                r++; //将右边界，往右移动，增加一位
                sum += nums[r];
            } else {
                l++; //将左边界，往右移动，减少一位
                sum -= nums[l];
            }
            if (sum >= s) {
                res = min(res, r - l + 1);
            }
        }

        if (res == nums.length + 1) { //如果没有，则返回0
            return 0;
        }
        return res;
    }

    //求最小值
    public static int min(int i, int j) {
        if (i < j) {
            return i;
        } else {
            return j;
        }
    }

}
