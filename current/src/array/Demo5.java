package array;

/**
 * @author Zhangkj
 * @date 2019-11-27-22:40
 */

/**
 *  {0, 0, 1, 1, 1, 2, 2, 3, 3, 4} 把数组中的  0  移到后面
 */
public class Demo5 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,0,0,0,0,0,2,3,3,4};

        //removeDuplicates(nums);

        isnot(nums);

        for (int i : nums) {
            System.out.print(i+"  ");
        }
    }

    private static void isnot(int[] nums) {
        int j=0;

        for (int i = 0; i < nums.length;i++){
            if(nums[i]==0){
                continue;
            }else{
                System.out.println(nums[i]);
                nums[j]=nums[i];
                j++;
            }

        }

        System.out.println(j);
        for (int k = j; k < nums.length; k++) {
            nums[k] = 0;
        }

    }



}
