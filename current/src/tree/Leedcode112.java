package tree;
/**

 * @author Zhangkj
 * @date 2019-12-04-19:43
 */



/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 *
 */
public class Leedcode112 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode root1 = new TreeNode(4);
        TreeNode root2= new TreeNode(11);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(2);
        TreeNode root5 = new TreeNode(8);
        TreeNode root6 = new TreeNode(13);
        TreeNode root7 = new TreeNode(4);
        TreeNode root8 = new TreeNode(1);

        root.left = root1;
        root1.left = root2;
        root2.left = root3;
        root2.right = root4;
        root.right = root5;
        root5.left = root6;
        root6.right = root7;
        root7.right = root8;

      //  TreeNode.bianli(root);

        Leedcode112 leedcode112 = new Leedcode112();

        System.out.println(leedcode112.hasPathSum(root,27));
    }

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }

        if((root.right==null&&root.left==null&&sum==root.val)){
            return true;
        }
        if((root.right==null&&sum!=root.val)&&(root.left==null&&sum!=root.val)){
            return false;
        }


        return  hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val)?true:false;
    }

    public boolean hasPathSum_1(TreeNode root, int sum) {
        if (root == null)
            return false;

        sum -= root.val;
        if ((root.left == null) && (root.right == null))
            return (sum == 0);
        return hasPathSum_1(root.left, sum) || hasPathSum_1(root.right, sum);
    }


}
