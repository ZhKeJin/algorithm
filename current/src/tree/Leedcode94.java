package tree;

import com.sun.media.sound.SoftTuning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author Zhangkj
 * @date 2019-12-03-11:07
 */

/**
 * 树的中序遍历
 * 例如：
 *  * 给定二叉树 [3,9,20,null,null,15,7],
 *  *
 *  *     3
 *  *    / \
 *  *   9  20
 *  *     /  \
 *  *    15   7
 *  * 返回其自底向上的层次遍历为：
 *  *

 */
public class Leedcode94 {

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


//        List<Integer> list = inorderTraversal(root);
        List<Integer> list = inorderTraversal_2(root);
//        List<Integer> list = inorderTraversal_3(root);
        for (Integer integer : list) {

            System.out.println(integer);
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        helper(root, arrayList);

        return arrayList;
    }

    private static void helper(TreeNode root, ArrayList<Integer> arrayList) {

        if (root != null) {

            helper(root.left, arrayList);
            arrayList.add(root.val);
            helper(root.right, arrayList);

        }

    }


    /**
     * 非递归；
     * @param root
     * @return
     */
    public static List < Integer > inorderTraversal_3(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

    /**
     * 非递归：用栈实现
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal_2(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

//        stack.push(root);
        while (!stack.empty()||root!=null) {


                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }

            TreeNode pop = stack.pop();

            arrayList.add(pop.val);


                root = pop.right;


        }

        return arrayList;
    }




}