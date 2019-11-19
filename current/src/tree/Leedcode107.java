package tree;

import java.util.*;

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


    static List<List<Integer>> list= new ArrayList<>();
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

        list = levelOrderBottom(root);

        for (List<Integer> objects : list) {

            System.out.println(objects);
        }
    }

    static List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root==null)return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while (!queue.isEmpty()){

            List<Integer> l = new LinkedList<>();

            int count = queue.size();
            while(count>0){

                TreeNode node = queue.peek();
                queue.poll();
                l.add(node.val);

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);


                count--;
            }

            list.add(l);

        }
        Collections.reverse(list);


        return list;

    }
}
