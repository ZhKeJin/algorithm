package tree;

/**
 * @author Zhangkj
 * @date 2019-12-25-10:03
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 后序遍历
 */
public class LC145 {

    public static void main(String[] args) {

        Queue<Integer> stack = new LinkedList<>();
        ((LinkedList<Integer>) stack).push(1);
        ((LinkedList<Integer>) stack).push(2);
        ((LinkedList<Integer>) stack).push(3);
        ((LinkedList<Integer>) stack).push(4);
        ((LinkedList<Integer>) stack).push(5);

        while(!stack.isEmpty()){

            System.out.println(stack.poll());
        }



        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(1) ;
        linkedList.push(2) ;
        linkedList.push(3) ;
        linkedList.push(4) ;
        linkedList.push(5) ;


        while(!linkedList.isEmpty()){

            System.out.println(linkedList.pollLast());

        }


    }
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }

    public List<Integer> postorderTraversal_1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }



}
