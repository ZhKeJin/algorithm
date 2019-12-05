package tree;

/**
 * @author Zhangkj
 * @date 2019-12-05-12:43
 */



import java.util.HashMap;
import java.util.TreeMap;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 *
 *
 * 	二叉树的根是数组中的最大元素。
 * 	左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 	右子树是通过数组中最大值右边部分构造出的最大二叉树。
 *
 *
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 *
 *
 *
 * 示例 ：
 *
 * 输入：[3,2,1,6,0,5]
 * 输出：返回下面这棵树的根节点：
 *
 *       6
 *     /   \
 *    3     5
 *     \    /
 *      2  0
 *        \
 *         1
 */
public class Leedcode654 {
    HashMap<Integer, Integer> hashMap =null;
    int[] nums = new int[]{};

    public static void main(String[] args) {
        Leedcode654 leedcode654 = new Leedcode654();
        TreeNode treeNode = leedcode654.get();

        TreeNode.bianli(treeNode);
    }


    public TreeNode get(){
        Leedcode654 leedcode654 = new Leedcode654();

        nums = new int[]{3, 2, 1, 6, 0, 5};

   //     int max = getMax(nums, 0, nums.length);

//        System.out.println(max);
        return  leedcode654.constructMaximumBinaryTree(nums);
//        return null;


    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
             hashMap.put(nums[i],i);
        }

       // int max = getMax(nums,0,nums.length);


        return createTree(nums,0,nums.length);


    }

    public TreeNode createTree(int[] nums,int l,int r){

        if(l>=r){
            return null;
        }

        int max = getMax(nums, l, r);

      //  System.out.println(max);
        TreeNode root = new TreeNode(max);



        Integer index = hashMap.get(max);

        //System.out.println(index+".....");
        root.left = createTree(nums,l,index);
        root.right = createTree(nums,index+1,r);

        return root;


    }

    public static int getMax(int[] nums, int l, int r){

        int max=nums[l];
        for (int i = l; i <r ; i++) {
            if(nums[i]>max)
                max = nums[i];
        }
        return max;

    }

}
