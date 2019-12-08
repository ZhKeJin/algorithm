package tree;

/**
 * @author Zhangkj
 * @date 2019-12-02-22:13
 */

import java.util.LinkedList;
import java.util.List;

/**
 * 先序
 *  * 例如：
 *  * 给定二叉树 [3,9,20,null,null,15,7],
 *  *
 *  *     3
 *  *    / \
 *  *   9  20
 *  *     /  \
 *  *    15   7
 *  * 返回其自底向上的层次遍历为：
 *  *
 *  * [
 *  *   [15,7],
 *  *   [9,20],
 *  *   [3]
 *  * ]
 */
public class Leedcode144 {

//    List<Integer> list = new ArrayList<Integer>();

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


//        List<Integer> list = preorderTraversal_1(root);
        List<Integer> list = preorderTraversal_2(root);
        for (Integer integer : list) {

            System.out.println(integer);
        }
    }

    public  List<Integer> preorderTraversal(TreeNode root) {

        if(root!=null){
//            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return null;
    }

    /**
     * 用队列实现是错的
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal_2(TreeNode root) {

        LinkedList<TreeNode> queue = new LinkedList<>();

        LinkedList<Integer> integers = new LinkedList<>();

        if (root == null) {
            return integers;
        }

        queue.add(root);
        while(!queue.isEmpty()){

            TreeNode treeNode = queue.pollFirst();
            integers.add(treeNode.val);
            if(treeNode.right!=null){
                queue.addFirst(treeNode.right);
            }
            if(treeNode.left!=null){
                queue.addFirst(treeNode.left);
            }

        }

        return integers;
    }


    /**
     * 树的先序只能用栈实现
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal_1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            System.out.println(node.val+"....");
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }







}
