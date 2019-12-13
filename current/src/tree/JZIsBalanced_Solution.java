package tree;

/**
 * @author Zhangkj
 * @date 2019-12-12-22:52
 */

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class JZIsBalanced_Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode root1 = new TreeNode(6);
        TreeNode root2 = new TreeNode(10);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(7);
        TreeNode root5 = new TreeNode(9);
        TreeNode root6 = new TreeNode(11);

        root.left = root1;
       // root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;
        root2.right = root6;

        JZIsBalanced_Solution jzIsBalanced_solution = new JZIsBalanced_Solution();

        boolean b = jzIsBalanced_solution.IsBalanced_Solution(root);
        System.out.println(b);



    }



    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        if (left == -1) return -1;
        int right = getDepth(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }



}
