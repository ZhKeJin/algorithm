package tree;


/**
 * @author Zhangkj
 * @date 2019-11-10-20:04
 */

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leedcode104 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);

        root.left = root1;
        root.right = root2;
        root2.left = root3;
        root2.right = root4;

        System.out.println(maxDepth_1(root,0));

    }


    public static int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        if(root.right==null&&root.left==null){
            return 1;
        }


        int rhigh = maxDepth(root.right);
        int lhigh = maxDepth(root.left);




        return Math.max(rhigh,lhigh)+1;
    }

    public static int maxDepth_1(TreeNode root,int count) {

        if(root==null){
            return 0;
        }

        if(root.right==null&&root.left==null){
            return 1;
        }


        int rhigh = maxDepth(root.right);
        int lhigh = maxDepth(root.left);

        count = Math.max(rhigh,lhigh)+1;


        return count;
    }

}
