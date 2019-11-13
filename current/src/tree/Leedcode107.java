package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-11-10-22:09
 */

/**
 * 层次遍历
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leedcode107 {

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

        levelOrderBottom(root);
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        ArrayList<List<Integer>> lists = new ArrayList<>();


        return lists;

    }
}
